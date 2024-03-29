package Datadrivent.core.helper;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Objects;

public class JSONHelper {
    public static Object[][] readJsonFromFile(String filePath){
        Object[][] dataProvider;
        try (Reader reader= new FileReader(filePath)){
            JSONParser parser = new JSONParser();
            Object dataReader = parser.parse(reader);
            JSONArray data =(JSONArray)dataReader;
            JSONObject firstObject =(JSONObject)data.get(0);
            int width = firstObject.size();
            int height = data.size();
            dataProvider = new Object[height][width];

            for (int i = 0; i < height; i++) {
                JSONObject obj = (JSONObject) data.get(i);
                String[] key = (String[]) obj.keySet().toArray(new String[0]);
                for (int j = 0; j < width; j++) {
                    if (obj == null) {
                        dataProvider[i][j] = "";
                    } else {
                        String dataFromKey = obj.get(key[j]).toString();
                        dataProvider[i][j] = dataFromKey;
                    }
                }
            }
            return dataProvider;
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        catch (ParseException e){
            e.printStackTrace();
        }
        return new Object[0][0];
    }
}
