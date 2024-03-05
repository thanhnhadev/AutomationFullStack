package JavaBasic.DieuKien;

public class SwitchCase {
    public static void main(String[] args) {
        int num=40;

        switch (num){
            case 10:
                System.out.println("10");break;
            case 20:
                System.out.println("20");break;
            case 30:
                System.out.println("30");
                break;
            default:
                System.out.println("not in 10 20 30");
        }
        String os= "windows";
        String brower = "chrome";
        switch (os){
            case "windows":
                System.out.println("run test platfrom windows");
                break;
            case "MacOs":
                System.out.println("run test macos");
                break;
            default:
                System.out.println("run test platform");
                break;
        }
    }
}
