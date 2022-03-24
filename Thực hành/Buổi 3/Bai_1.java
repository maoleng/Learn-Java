public class Bai_1 {
    public static void printArray(int[] arr, int n){
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void removeElement(int[] arr, int k, int n){
        boolean check;
        check = false;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == k){
                check = true;
                for(int j = i; j < arr.length - 1; j++){
                    arr[j] = arr[j+1];
                }
                n--;
            }
        }
        System.out.println(check);
        printArray(arr, n);
    }
    public static void insertElement(int[] arr, int k, int n, int p){
        for(int i = arr.length - 1; i > p; i--){
            arr[i] = arr[i - 1];
        }
        arr[p] = k; 
        System.out.println();
        printArray(arr, n--);
    }
    public static void findDuplicate(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.println(arr[j]);
                    break;
                }
            }
        }
    }
    public static int removeDuplicateElements(int arr[], int n){  
        if (n==0 || n==1){  
            return n;  
        }  
        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];     
        // Changing original array  
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
        return j;  
    }  
    public static void main(String[] args){
        int arr[] = {10,20,20,30,30,40,50,50};  
        //removeElement(arr, 13, 6);
        //insertElement(arr, 16, 6, 3);
        //findDuplicate(arr);
        int length = arr.length;
        length = removeDuplicateElements(arr, length);
        for(int i = 0; i < length; i++){
            System.out.print(arr[i] + " ");
        }
        
    }
}
