public class cau_2 {
    public static void main(String[] args) {
        int mang[] = new int [] {5,15,23,2,0,156,-5,66};
        int a = tim_so_be_nhat(mang);
        System.out.println(a);
    }

    public static int tim_so_be_nhat (int mang[]) {
        int min = mang[0];
        for ( int i = 0; i< mang.length; i++ ) {
            if ( mang[i] < min ) {
                min = mang[i];
            }
        }
        return min;
    }

}
