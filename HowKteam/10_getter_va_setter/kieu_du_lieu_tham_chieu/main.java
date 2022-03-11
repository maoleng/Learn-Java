public class main {
    public static void main (String[] args) {
        array mang = new array();
        int arr[] = {1,2,23,3,5};
        mang.nhap_vao_mang(arr);
        System.out.println("luc dau");
        mang.xuat_mang();
        System.out.println();
        System.out.println("sau khi gan");
        arr[1] = 23;
        mang.xuat_mang();

        System.out.println();
        
        int[] mang_lay_bang_phuong_thuc = mang.gia_tri_mang();
        for ( int i: mang_lay_bang_phuong_thuc ) {
            System.out.print(i + " ");
        }
    }
}
