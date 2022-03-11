public class person {
    public String ten;
    public int tuoi;
    public float chieu_cao;

    public person (String ten, int tuoi, float chieu_cao) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.chieu_cao = chieu_cao;
    }
    // de chong' override: them "final" o phuong thuc trong class cha
    // public final void get_info() {...}
    public void get_info () {
        System.out.println(this.ten);
        System.out.println(this.tuoi);
        System.out.println(this.chieu_cao);
    }

}