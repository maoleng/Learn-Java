public class cau_7 {
    public static void main(String[] args) {
        kiem_tra("c");
    }

    public static void kiem_tra (String chuoi) {
        int check_chuoi = Integer.parseInt(chuoi);
        if ( (check_chuoi >= 97 && check_chuoi <= 122) || (check_chuoi >= 65 && check_chuoi <= 90) ) {
            System.out.println("Do la ki tu thuoc alphabet");
            return;
        }
        System.out.println("Do khong phai la ki tu thuoc alphabet");
    }
}
