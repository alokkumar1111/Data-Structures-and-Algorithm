class removeDuplicates{
  public static int removeDuplicates(int[] arr){
    if(arr.length==0) return 0;
    
    int uniqueIndex=0;
    for(int i=1; i<arr.length; i++){
      if(arr[i]!=arr[uniqueIndex]){
        uniqueIndex++;
        arr[uniqueIndex]=arr[i];
      }
    }
    for(int i=0; i<=uniqueIndex; i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
    return uniqueIndex+1;
  }
  public static void main(String ar[]){
    int[] arr={1, 1, 1, 2, 3, 4, 4};
    System.out.print("Length of new array: "+removeDuplicates(arr));
  }
}
//Tc:O(n)
