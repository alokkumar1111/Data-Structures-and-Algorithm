
class recursionExerciseTwo{
  public static int calculateStringLength(String str){
    if(str==null || str.isEmpty()){
      return 0;
    }
    return 1+calculateStringLength(str.substring(1));
  }
  public static void integerNumberToNumericWords(int num){
    String words[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
    if(num==0 || num%10==0) return;
    
    integerNumberToNumericWords(num/10);
    
    int digit=num%10;
    System.out.print(words[digit]+" ");
  }
  public static void main(String ar[]){
    System.out.println("Length of string (calcualted using recursion): "+calculateStringLength("Darbhanga"));
    integerNumberToNumericWords(1947);
  }
}
