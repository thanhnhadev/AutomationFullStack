package JavaBasic.Variables;

public class StacticVariable {
    int tuoi=20;//biến toàn cục
    static int age =30;

    public static void main(String[] args) {
        StacticVariable stacticVariable= new StacticVariable();

        System.out.println("tuoi:"+age);
        System.out.println("tuoi:"+stacticVariable.tuoi);
    }
}
