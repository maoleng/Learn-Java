public class student {
    public String ten;
    // khi da dung getter va setter thi nen de private
    private int tuoi;
    public float chieu_cao;

    public student( String ten, int tuoi, float chieu_cao ) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.chieu_cao = chieu_cao;
    }

    public void nhap_vao_tuoi (int tuoi) {
        this.tuoi = tuoi;
    }

    public int xuat_ra_tuoi () {
        return this.tuoi;
    }
}
