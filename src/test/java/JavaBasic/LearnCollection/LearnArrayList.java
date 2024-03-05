package JavaBasic.LearnCollection;

import java.util.ArrayList;
import java.util.Objects;

public class LearnArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        ArrayList<String> arrayList1 = new ArrayList<String>();
        arrayList.add("selenium");
        arrayList.add("TestNg Framework");
        arrayList.add("selenuim");
        //them vao voi vi tri chi dinh
        arrayList.add(1,"extend report");
        arrayList.add("");
        arrayList.add("");
//        Trim Size - cat bo gia tri rong
        arrayList.trimToSize();
//        remove phan tu trong arraylist
        arrayList.remove("selenium");
//        remove vi tri
        arrayList.remove(1);

//        Duyet ArrayList dung for co ban
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println("-----------");
        arrayList1.add("play right");
        arrayList1.add("cypress");

        //add all arrylist1 vao arraylist
        arrayList.addAll(arrayList1);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
//tim kiem phan tu trong arrayllist
        System.out.println("tim kiem phan tu:"+arrayList.contains("cypress"));

//chuyen  arraylist về dang array
        Object[] mang = arrayList.toArray();
        for (int i = 0; i < mang.length; i++) {
            System.out.println(mang[i]);
        }
    }

}
