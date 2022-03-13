// Tao mot class truu tuong
// Class nay khong the tao doi tuong, chi co the tao class ke thua tu class nay
// Vi du: class people la class truu tuong, class student va class teacher ke thua class people
public abstract class people {
    // Khai bao bien nen dung pham vi protected de cac class ke thua no de~ truy cap
    protected String ten;
    protected int tuoi;
    protected float chieu_cao;

    public people (String ten, int tuoi, float chieu_cao) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.chieu_cao = chieu_cao;
    }

    // Khai bao phuong thuc truu tuong
    // Phuong thuc truu tuong khong duoc co body
    public abstract void gioi_thieu ();
}
