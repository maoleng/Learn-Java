public class hello_oke {
    public static void main(String[] args) {
        person Loc = new person();
        Loc.name = "Mao Leng";
        Loc.age = 19;
        Loc.height = 1.7f;
        // System.out.println(Loc.name);


        person con_nguoi[] = new person[2];
        for ( int i = 0; i < con_nguoi.length; i++ ) {
            con_nguoi[i] = new person();
            con_nguoi[i].name = "Bambu thu " + i;
            con_nguoi[i].age = 15;
            con_nguoi[i].height = 1.6f;
        }
        
        for ( int i = 0; i < con_nguoi.length; i++ ) {
            System.out.println(con_nguoi[i].name);
            System.out.println(con_nguoi[i].age);
            System.out.println(con_nguoi[i].height);
        }
        
    }
}
