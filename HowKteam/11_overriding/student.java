public class student extends person {
    public student ( String ten, int tuoi, float chieu_cao ) {
        super( ten, tuoi, chieu_cao );
    }

    // student dang ghi de` phuong thuc get_info
    public void get_info () {
        super.get_info();
        System.out.println("day la level 2 cua phuong thuc get info");
    }

}