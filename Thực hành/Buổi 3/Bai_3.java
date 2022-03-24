import java.lang.String;

public class Bai_3 {
    public static String returnFirstAndLastName(String name){
        String arr[] = name.split(" ");
        return arr[0] + " " + arr[arr.length - 1];
        
    }
    public static void returnMiddleName(String name){
        String arr[] = name.split(" ");
        for(int i = 1; i < arr.length - 1; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void capitalizeFullName(String name){
        String arr[] = name.split(" ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1).toLowerCase();
            System.out.print(arr[i] + " ");
        }

    }
    public static void upercaseVowelsAndLowercaseConsonants(String name){
        char arr[] = name.toCharArray();
        for(int i = 0; i < arr.length; i++){
           if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u'){
                char c = Character.toUpperCase(arr[i]);
                arr[i] = c;
           }
           else{
               char c = Character.toLowerCase(arr[i]);
               arr[i] = c;
           }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args){
        String name = "Nguyen thi thu thao";
        System.out.println(returnFirstAndLastName(name));
        returnMiddleName(name);
        System.out.println();
        capitalizeFullName(name);
        System.out.println();
        upercaseVowelsAndLowercaseConsonants("Nguyen Van Chien");
    }
}
