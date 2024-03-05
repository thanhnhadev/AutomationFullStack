package JavaBasic.Method;

public class MethodCoThamSo {
    static float Interest_Rate = 7.3f;

    public static double tinhlai(long sotienGui) {
        return ((sotienGui * Interest_Rate) / 100);
    }


    public static double cong2so(double number1, double numbe2) {
        return number1 + numbe2;
    }

    public static double cong2soNguyen(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        System.out.println("tien lai 12 thang:" + tinhlai(1000000));
        System.out.println("cong2songuyen:" + cong2soNguyen(10, 30));
        System.out.println("cong2so:"+cong2so(10,20));

    }
}
