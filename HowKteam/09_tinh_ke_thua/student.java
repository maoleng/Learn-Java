//do class person co cac thuo 
public class student extends person{
    public student ( String ten, int tuoi, float chieu_cao ) {
        //Dùng từ khóa super để truy cập các từ khóa từ lớp cha
        super(ten, tuoi, chieu_cao);
    }

    
    // Tao 1 phuong thuc moi ten giong phuong thuc cu
    // Dung super de lay ra phuong thuc get info tu class cha person
    // Them nhieu doan code vao phuong thuc moi
    public void get_info() {
        super.get_info();
        System.out.println("Day la phien ban nang cap cua get_info");
    }
}
