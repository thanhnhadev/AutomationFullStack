package JavaOOP.com.anhtester.PhamViTruyCap;

public class Company {
    public static void main(String[] args) {
        Employess employess = new Employess();
        System.out.println(employess.getName());
        Employess employess1 =new Employess();
        System.out.println(employess1.getAdress());
        // đối tương annoymous - vo danh - khong co ten doi tuong
        new Employess().getName();
        new Employess().getAdress();
    }
}
