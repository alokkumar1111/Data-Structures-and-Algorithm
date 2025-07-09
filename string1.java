import java.util.*;
class StringConversion{
    public static String charConversion(String str){
        StringBuilder sb=new StringBuilder("");
        sb.append(Character.toUpperCase(str.charAt(0)));
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void checkLowerCaseVowels(String str){
        int count=0;
        for(int i=0; i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                count++;
            }
        }
        System.out.println("Number of lower case vowels: "+count);
    }
    public static String compress(String str){
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count);
            }
        }
        return sb.toString();
    }

    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string for first letter capital: ");
        String str=sc.nextLine();
        System.out.println("Enter the string to check lower case vowels: ");
        String str1=sc.nextLine();
        System.out.println("Enter the string for compression: ");
        String str2=sc.nextLine();
        System.out.println("modified string: "+charConversion(str));
        checkLowerCaseVowels(str1);
        System.out.println("Compressed string: "+compress(str2));
        sc.close();
    }
}
