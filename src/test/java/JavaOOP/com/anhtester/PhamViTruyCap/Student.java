package JavaOOP.com.anhtester.PhamViTruyCap;

public class Student {
    //private
    private String name="Automation";
    private int age=26;
    private String cccd = "071564813666";
    //protected
    protected String getName(){
        return name;
    }
    protected String getCccd(){
        return cccd;
    }
    //Default - khong co tu khoa
    void printAge(){
        System.out.println("Age: " + age);
    }
    //public
    public void getInforStudent(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("cccd:"+cccd);
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.getInforStudent();
    }

}
