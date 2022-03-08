public class student {
    String ten;
    int tuoi;
    float chieu_cao;

    // tao bien static
    public static String ten_truong = "Ton Duc Thang University";
    public static int dem = 0;
    public student ( String ten, int tuoi, float chieu_cao ) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.chieu_cao = chieu_cao;
        dem += 1;
    }
}
