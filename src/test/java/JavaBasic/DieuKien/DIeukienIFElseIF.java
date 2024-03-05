package JavaBasic.DieuKien;

public class DIeukienIFElseIF {
    public static void main(String[] args) {
        int number1=10;
        int number2=20;
        String name="FpT";
        if (number1>30){
            System.out.println("thoa dieu kien 1");
        }else if (number1 >= 20){
            System.out.println("thoa dieu kien 2");
        } else if (number1 >= 5) {
            System.out.println("thoa dieu kien 3");
        } else  {
            System.out.println("khong thoa dieu kien nao ca");
        }
        int dtb=7;
        if (dtb>=8){
            System.out.println("hs gioi");
        } else if (dtb>=7&&dtb<8) {
            System.out.println("hs kha");
        } else if (dtb>=5&& dtb<7) {
            System.out.println("hs tb");
        }else {
            System.out.println("hs y");
        }

    }
}
