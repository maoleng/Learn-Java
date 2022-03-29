class JavaBasic
{
    public static int posMod3(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if ( a[i] % 3 == 0 ) {
                return i;
            }
        }
        return -1;
        
    }
    
    public static void main(String[] arg)
    {
        int[] a = {8, 4, 1, -46, 5};
        System.out.println(posMod3(a));
    }
}
