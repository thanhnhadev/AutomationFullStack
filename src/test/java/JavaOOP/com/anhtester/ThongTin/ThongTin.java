package JavaOOP.com.anhtester.ThongTin;

import JavaOOP.com.anhtester.PhamViTruyCap.Student;

public class ThongTin extends Student {
    public void getInfor(){
        System.out.println(getName());
        System.out.println(getCccd());

    }

    public static void main(String[] args) {
        Student student = new Student();
        ThongTin thongTin = new ThongTin();
        thongTin.getInfor();
    }
}
