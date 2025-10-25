public class Main {
  public static boolean palindromeString(String str){
    for(int i=0; i<str.length(); i++){
       if(str.charAt(i)!=str.charAt(str.length()-1-i)){
         return false;
       }
    }return true;
  }
  public static float getDisplacement(String path){
    int x=0, y=0;
    for(int i=0; i<path.length(); i++){
      char dir=path.charAt(i);
      if(dir=='N'){
        y++;
      }
      if(dir=='S'){
        y--;
      }
      if(dir=='E'){
        x++;
      }
      else{
        x--;
      }
    }
    int x2=x*x;
    int y2=y*y;
    return (float)Math.sqrt(x2+y2);
  }
  
  public static void stringComparison(){
    String s1="Tony";
    String s2="Tony";
    String s3=new String("Tony");
    
    if(s1==s2){
      System.out.println("Strings are equal");
    }else{
      System.out.println("Strings are not equal");
    }
    if(s1==s3){
      System.out.println("Strings are equal");
    }else{
      System.out.println("Strings are not equal");
    }
    
    if(s1.equals(s3)){
      System.out.println("Strings are equal");
    }else{
      System.out.println("Strings are not equal");
    }
  }
  
  public static void substringOperations(){
    String str="HelloWorld";
    String substr="";
    for(int i=2; i<6; i++){
      substr+=str.charAt(i);
    }
    System.out.println("Substring: "+substr);
    System.out.println("Substring: "+str.substring(3,6));
  }
  
  public static void largestString(){
    String[] fruits={"Apple", "Pineapple", "Strawberry", "Banana"};
    String largest=fruits[0];
    for(int i=0; i<fruits.length; i++){
      if(largest.compareTo(fruits[i])<0){
        largest=fruits[i];
      }
    }
    System.out.println(largest);
  }
  
  
  public static void stringBuilderFunction(){
    StringBuilder sb=new StringBuilder(" ");
    for(char ch='a'; ch<='z'; ch++){
      sb.append(ch);
    }
    System.out.println(sb);
    System.out.println(sb.length);
  }
  
  
  public static String toUpperCase(String str){
    StringBuilder sb=new StringBuilder(" ");
    char ch=Character.toUpperCase(str.charAt(0));
    sb.append(ch);
    for(int i=1; i<str.length; i++){
      if(str.charAt(i)==' ' && i<str.length()-1){
        sb.append(str.charAt(i));
        i++;
        s
      }
    }
  }
    public static void main(String[] args) {
      String str="racecar";
      System.out.println("Palindrome or not: "+palindromeString(str));
      
      System.out.println("Displacement: "+getDisplacement("WEENESENNS"));
      
      stringComparison();
      substringOperations();
      largestString();
      
      
      stringBuilderFunction();
  }
}
