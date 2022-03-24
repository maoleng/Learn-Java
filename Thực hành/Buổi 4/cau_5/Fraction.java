import java.lang.Math;

public class Fraction {
    public int numerator;
    public int denominator;
    
    public Fraction (int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int USCLN(int a, int b) {            
        a=Math.abs(a);
        b=Math.abs(b);            
        if (a==0 ||b==0)
            return a+b;
        while (a !=b)
        {
            if(a>b)
                a=a-b;
            else
                b=b-a;
        }
        return a;
    }

    public void reducer() {
        int USCLN = USCLN(this.numerator, this.denominator);
        System.out.println("Phan so toi gian la: " + this.numerator / USCLN + "/" + this.denominator / USCLN);

    }
    

}
