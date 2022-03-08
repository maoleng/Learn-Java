public class main {
    public static void main(String[] args) {
        student hoc_sinh_1 = new student ( "Mao Leng", 19, 1.75f );
        System.out.println(hoc_sinh_1.ten_truong);

        // khi khai bao static co the goi nhu nay`
        System.out.println(student.ten_truong);
        System.out.println(hoc_sinh_1.dem);

        student hoc_sinh_2 = new student ( "Bunnie", 19, 1.6f );
        System.out.println("so hoc sinh hien tai la: " + student.dem);
    }
}