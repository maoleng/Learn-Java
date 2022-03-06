public class call {
    public static void main(String[] args) {

        // làm vầy để dễ chỉnh sửa (truyền vào tham số )
        person me = new person( "mao leng", 19, 1.75f);

        // Các thuộc tính
        // me.ten = "mao leng";
        // me.tuoi = 19;
        // me.chieu_cao = 1.75f;

        // Các phương thức
        System.out.println(me.ten);
        me.eat("com ga");
    }
}
