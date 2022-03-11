public class main {
    public static void main(String[] args) {
        student student_a = new student ("Mao Leng", 19, 1.75f);

        int tuoi_hoc_sinh_a = student_a.xuat_ra_tuoi();
        System.out.println(tuoi_hoc_sinh_a);

        // nhap vao tuoi moi
        // sau khi nhap thi tuoi se duoc sua
        student_a.nhap_vao_tuoi(20);
        // xuat ra tuoi moi
        System.out.println(student_a.xuat_ra_tuoi());
    }
}
