package JavaBasic.Variables;

public class LearnVariables {
   static int age =26;//biến toàn cục
    public void sayHello(){
        int n =10;//biến cục bộ local
        System.out.println("gia tri n la "+n);
    }
    public static void main(String[] args) {
//        System.out.println("hello world");
//       String fullName = "Anhtest";
        System.out.println(age);
        //cach 1
        LearnVariables abc = new LearnVariables();
        abc.sayHello();
    }
}
