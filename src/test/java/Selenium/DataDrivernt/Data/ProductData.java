package Selenium.DataDrivernt.Data;

import Datadrivent.core.helper.JSONHelper;
import org.testng.annotations.DataProvider;

import java.util.Objects;

public class ProductData {
    @DataProvider(name="ProductData")

    public Object[][] data(){
        return new Object[][] {
                {
                        "standard_user","secret_sauce","Sauce Labs Backpack"
                },
                {
                        "locked_out_user","secret_sauce","Sauce Labs Bike Light"
                },
                {
                        "problem_user","secret_sauce","Sauce Labs Bolt T-Shirt"
                },
                {
                        "performance_glitch_user","secret_sauce","Sauce Labs Fleece Jacket"
                },
                {
                        "error_user","secret_sauce","Sauce Labs Onesie"
                },
                {
                    "visual_user","secret_sauce","Test.allTheThings() T-Shirt (Red)"
                }
        };
    }

    @DataProvider(name="productDataFromJSON")
    public Object[][] dataFromJSON() {
        return JSONHelper.readJsonFromFile("src/main/java/Datadrivent/core/helper/JSONHelper.java");
    }
}
