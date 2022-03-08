// chen` package person vao file main
import my_pack.person;
public class call {
    public static void main(String[] args) {
        person me = new person( "mao leng", 19, 1.75f);
        System.out.println(me.ten);
        me.eat("com ga");
    }
    // o pham vi private thi bien do chi truy cap duoc o class do
    // o pham vi default: giong private
    // o pham vi protected: tinh ke thua
}