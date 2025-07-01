import java.util.Scanner;
import java.util.Arrays;
class Main {
    public static boolean Anagrams(String str1, String str2){
        str1=str1.replace(" ","").toLowerCase();
        str2=str2.replace(" ","").toLowerCase();
        if(str1.length()!=str2.length()){
            return false;
        }
        char[] arr1=str1.toCharArray();
        char[] arr2=str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter first string: ");
        String str1=sc.nextLine();
        System.out.println("Enter second string: ");
        String str2=sc.nextLine();
        System.out.println(Anagrams(str1,str2));
    }
}
