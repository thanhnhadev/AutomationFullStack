package JavaOOP.com.anhtester.PhamViTruyCap;

import java.util.ArrayList;

public class Employess {
    String name="Test";
    String birthday;
    int age = 30;
    String adress= "tphcm";
    //khoi lenh dang block
    //chay dau tien trong class nay
    static {
        System.out.println("load config");
    }
    public String getName(){
        return name;
    }

    public String getAdress() {
        return adress;
    }


    public static void main(String[] args) {
        //khai bao class va objects
        Employess employess1= new Employess();
        System.out.println(employess1.getName());
        Employess employess2= new Employess();
        System.out.println(employess2.getAdress());
    }
}
