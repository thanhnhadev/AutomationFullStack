package JavaBasic.DieuKien;

public class BieuThucIFElse {
    public static void main(String[] args) {
        int age = 30;
        String name="Auto";
        String message ="Add Category successfull";
        if (age>20 && name.equals("Manual")||message.contains("success")){
            System.out.println("Thỏa dieu kien");
        }
        int number = 14;
        if (number%2==0){
            System.out.println("So "+number+" la so chan");
        }else {
            System.out.println("so "+number+" la so le");
        }
    }
}
