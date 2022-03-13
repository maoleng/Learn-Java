import org.omg.CORBA.PolicyErrorHelper;

public class student extends people {
    public student (String ten, int tuoi, float chieu_cao) {
        super(ten, tuoi, chieu_cao);
    }
    
    // Class ke thua class truu tuong buoc phai tao ra phuong thuc ke thua tu class truu truong da dat. ra san~
    public void gioi_thieu() {
        System.out.println("Toi ten la " + this.ten + ", tuoi la: " + this.tuoi + ", chieu cao la: " + this.chieu_cao);
    }

}
