package JavaBasic.kieudulieu;

public class Bank {
    static int Vat =1000;
    static float InterstRate =7.3f;
    static String BANKNAME ="viettinbank";

    static String Address="tphcm";
    static String Phone = "0123456";
    public static void getBankInfo(){
        System.out.println("BankName:"+ BANKNAME);
        System.out.println("Bank Address:"+Address);
        System.out.println("Bank Phone:"+Phone);
        System.out.println("Bank InterestRate:"+InterstRate);
    }
    public static double getBankInterestRate(){

        return InterstRate;
    }
}
