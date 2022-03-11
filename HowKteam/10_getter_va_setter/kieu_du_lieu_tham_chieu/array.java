public class array {
    private int array[];

    public void nhap_vao_mang(int array[]) {
        this.array = array.clone();
    }

    public int[] gia_tri_mang () {
        return this.array;
    }

    public void xuat_mang () {
        for (int i : this.array) {
            System.out.print(i + " ");
        }
    }
}
