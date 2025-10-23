class checkIfArrayIsSorted{
  public static boolean checkFunction(int[] arr){
    for(int i=1; i<arr.length; i++){
      if(arr[i]<arr[i-1]){
        return false;
      }
    }
    return true;
  }
  public static void main(String ar[]){
    int[] arr={1,2,3,7,6,8,9};
    int[] arr1={1,2,3,6,8,9};
    System.out.println(checkFunction(arr));
    System.out.println(checkFunction(arr1));
  }
}
//TC: O(n)
//SC; O(1)
