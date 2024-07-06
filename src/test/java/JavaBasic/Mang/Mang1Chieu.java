package JavaBasic.Mang;

public class Mang1Chieu {
    public static void main(String[] args) {
//        khai bao mang
        int songuyen[]=new int[20];
//        them gia tri vao mang
        songuyen[0]=5;
        songuyen[2]=10;
        songuyen[19]=30;
//in gia tri trong mang theo thu cong tung vi tri
//        System.out.println(songuyen[0]);
//        System.out.println(songuyen[1]);
//        System.out.println(songuyen[2]);
//        System.out.println(songuyen[3]);
//        System.out.println(songuyen[19]);
        System.out.println("Do dai mang:"+songuyen.length);
//        duyet phat tu trong mang voi vong lap for
//        nho dung lai voi gia tri < do dai mang do 1 don vi vi no bat dau tu 0
        for (int i=0;i< songuyen.length;i++){
            System.out.println(songuyen[i]);
        }
        //them gia tri vao mang thong qua vong lap for
        for (int i = 0; i < songuyen.length; i++) {
            if (i%2==0){
                songuyen[i]=10;
            }
        }
        for (int i = 0; i < songuyen.length; i++) {
            System.out.println(songuyen[i]);
        }
    }
}
