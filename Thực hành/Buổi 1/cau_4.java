public class cau_4 {
    public static void main(String[] args) {
        do_f_sang_do_c(37.4f);
        do_c_sang_do_f(30);
    }

    public static void do_c_sang_do_f (float do_c) {
        System.out.println((do_c * 9 / 5) + 32);
    }
    public static void do_f_sang_do_c (float do_f) {
        System.out.println((do_f - 32) * 5 / 9);
    }
}
