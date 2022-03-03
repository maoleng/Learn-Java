import java.util.Scanner;
public class cau_2 {
    public static void main(String[] args) {
        float day;
        float chieu_cao;
        
        Scanner sc = new Scanner(System.in);
        day = sc.nextFloat();
        chieu_cao = sc.nextFloat();
        
        System.out.println("Dien tich la: " + day * chieu_cao / 2 );
    }
    
}