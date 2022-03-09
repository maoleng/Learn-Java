public class person {
    public String ten;
    public int tuoi;
    public float chieu_cao;

    public person ( String ten, int tuoi, float chieu_cao ) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.chieu_cao = chieu_cao;
    }

    public void get_info () {
        System.out.println("Ten la: " + this.ten);
        System.out.println("Tuoi la: " + this.tuoi);
        System.out.println("Chieu cao la: " + this.chieu_cao);
    }
}