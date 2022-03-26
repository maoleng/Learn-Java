public class JavaBasic{
    public static int sumNegativeElements(int arr[]){
        int sum = 0;
        for (int i : arr) {
            if ( i < 0 ) {
                sum += i;
            }
        }
        
        System.out.println(sum);
        return sum;
    }

    public static String uppercaseFirstVowels(String str){
        // for (int i = 0; i < str.length(); i++) {
        //     if (str.charAt(i).compareTo(" ")) {

        //     }

        // }
        System.out.println(str.charAt(0));
        return str.charAt(0);
      
    }
	
	public static int findMinNegativeElement(int a[]){
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if ( a[a.length - 1] < min && i + 1 == a.length ) {
                return a[a.length -1];
            }
            if ( a[i] < a[i+1] ) {
                min = a[i];
            }
        }
        return min;
    }
	
	public static String getName(String str){
        return str.substring(6);
    }

    public static int findFirstMod3Element(int[] a){
        for ( int i = 0; i < a.length; i++) {
            if ( a[i] % 3 == 0 ) {
                return i;
            }
        }
        return -1;
    }

    // public static int countString(String str, String k){
        
    // }

    public static void main(String[] args){
        int a[] = {1,-2,3,4,-2,1,-9};
        String s = "nguyen thi uyen an";
		String s1 = "Name: Le Thi Thu Thao";
        String s2 = "Nguyen Thi Oanh Oanh";
        //Test all of methods which you implemented
        // sumNegativeElements(a);
        // System.out.println(findFirstMod3Element(a));
        // System.out.println(findFirstMod3Element(a));
        // System.out.println(getName(s1));
        uppercaseFirstVowels(s);
    }

}