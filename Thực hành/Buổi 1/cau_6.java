public class cau_6 {
    public static void main(String[] args) {
        tim_so_nho_nhat(10, 5, 20);
    }
    public static void tim_so_nho_nhat (int a, int b, int c) {
        if ( a <= b && a <= c ) {
            System.out.println("So nho nhat la: " + a);
            return;
        }
        if ( b <= a && b <= c ) {
            System.out.println("So nho nhat la: " + b);
            return;
        }
        if ( c <= a && c <= b ) {
            System.out.println("So nho nhat la: " + c);
            return;
        }
    }
}
