public class Bai_2 {
    public static void printArray(int[][] a){
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[0].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void addTwoMatrices(int[][] a, int[][] b){
        int[][] c = new int[a.length][a[0].length];
        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a[0].length; j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        printArray(c);
    }

    public static void multiplyMatrixWithNumber(int[][] a, int k){
        int[][] b = new int[a.length][a[0].length];
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[0].length; j++){
                b[i][j] = a[i][j] * k;
            }
        }
        printArray(b);
    }

    public static void main(String[] args){
        int[][] a = new int[2][2];
        int[][] b = new int[2][2];
        a[0][0] = 1;
        a[0][1] = 2;
        a[1][0] = 3;
        a[1][1] = 4;
        b[0][0] = 5;
        b[0][1] = 6;
        b[1][0] = 7;
        b[1][1] = 8;
        addTwoMatrices(a, b);
        System.out.println();
        multiplyMatrixWithNumber(a, 2);
    }
}
