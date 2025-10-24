
class rotateByD{
  public static void reverseFunction(int[] arr, int start, int end){
    while(start<end){
      int temp=arr[start];
      arr[start]=arr[end];
      arr[end]=temp;
      start++;
      end--;
    }
}
  public static void rightRotateByD(int[] arr, int k){
    int n=arr.length;
    k=k%n;
    
    reverseFunction(arr, 0, n-1);
    
    reverseFunction(arr, 0, k-1);
    
    reverseFunction(arr, k, n-1);
    
    printArray(arr);
  }
  public static void printArray(int[] arr){
    System.out.println("Rotated Array: ");
    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i]+" ");
    }
  }
  public static void main(String ar[]){
    int[] arr={1,2,3,4,5,6,7};
    rightRotateByD(arr, 3);
  }
}
//TC: O(n)
//SC: O(1)
