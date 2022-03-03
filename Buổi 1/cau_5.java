public class cau_5 {
    public static void main(String[] args) {
        kiem_tra_nam_nhuan(2022);
    }

    public static void kiem_tra_nam_nhuan(int nam) {
        if ( nam % 400 == 0 ) {
            System.out.println("Day la nam nhuan");
            return;
        }
        if ( nam % 4 == 0 && nam % 100 != 0 ) {
            System.out.println("Day la nam nhuan");
            return;
        }
        System.out.println("Khong phai la nam nhuan");
    }
}
