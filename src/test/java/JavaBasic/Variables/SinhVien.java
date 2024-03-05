package JavaBasic.Variables;

public class SinhVien {
    public String ten;

    private int tuoi;
    public SinhVien(String ten){
        this.ten=ten;
    }
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void showStudent() {
        System.out.println("Ten:"+ten);
        System.out.println("Tuoi:"+tuoi);
    }

    public static void main(String[] args) {
        SinhVien sv= new SinhVien("Nguyen Ty");
        sv.setTuoi(21);
        sv.showStudent();
    }
}
