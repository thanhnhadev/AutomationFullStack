package JavaBasic.Demo;

public class testArray {
    public static void main(String[] args) {
//        khai bao mang
        int songuyen[]=new int[20];
//        them gia tri vao mang
        songuyen[0]=5;
        songuyen[2]=10;
        songuyen[19]=30;
        System.out.println("Do dai mang:"+songuyen.length);
//        duyet phat tu trong mang voi vong lap for
//        nho dung lai voi gia tri < do dai mang do 1 don vi vi no bat dau tu 0
        for (int i=0;i< songuyen.length;i++){
            System.out.println(songuyen[i]);
        }
    }
}
