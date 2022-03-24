public class Bai_4 {
    public static int lengthOfString(String s){
        char[] arr = s.toCharArray();
        return arr.length;
    }

    public static int countWord (String s) {
        char[] arr = s.toCharArray();
        int length = arr.length;
        int word = 1;
        for (int i = 0; i < length - 1; i++) {
            if (arr[i] == ' ' && arr[i + 1] != ' ') {
                word++;
            }
        }
        return word;
    }

    public static void combineString (String s, String x) {
        System.out.println(s + x);
    }

    public static void checkPalindrome (String s) {
        StringBuilder str = new StringBuilder(s);
        String str2 = str.reverse().toString();
        System.out.println(str2.equals(s));
    }

    public static void main(String[] args){
        String s = "MADAM";
        System.out.println(lengthOfString(s));
        System.out.println(countWord(s));
        String x = "Oke oke oke";
        combineString(s, x);
        checkPalindrome(s);
    }
}
