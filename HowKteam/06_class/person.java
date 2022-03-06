public class person {
    public String ten;
    public int tuoi;
    public float chieu_cao;

    public person (String ten, int tuoi, float chieu_cao) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.chieu_cao = chieu_cao;
    }

    public void eat(String ten_do_an) {
        System.out.println(ten + " dang an " + ten_do_an );
    }
}
