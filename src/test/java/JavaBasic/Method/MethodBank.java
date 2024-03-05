package JavaBasic.Method;

import JavaBasic.kieudulieu.Bank;

public class MethodBank {
    public static void main(String[] args) {
        Bank.getBankInfo();
        double tongtien= (Bank.getBankInterestRate()*100000000)/100;
        System.out.println("tong tien lai:"+tongtien);

    }
}
