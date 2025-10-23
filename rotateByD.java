// class rotateByD{
//   public static void leftRotateByD(int[] arr, int k){
//     int n=arr.length;
//     int[] temp=new int[k];
//     for(int i=0; i<k; i++){
//       temp[i]=arr[i];
//     }
//     for(int i=k; i<arr.length; i++){
//       arr[i-k]=arr[i];
//     }
//     for(int i=0; i<k; i++){
//       arr[n-k+i]=temp[i];
//     }
//     printArray(arr);
//   }
//   public static void printArray(int[] arr){
//     System.out.println("Rotated Array: ");
//     for(int i=0; i<arr.length; i++){
//       System.out.print(arr[i]+" ");
//     }
//   }
//   public static void main(String ar[]){
//     int[] arr={1,2,3,4,5,6,7};
//     System.out.println("Original Array: ");
//     for(int i=0; i<arr.length; i++){
//       System.out.print(arr[i]+" ");
//     }
//     System.out.println();
//     leftRotateByD(arr, 3);
//   }
// }
//Brute force approach (Using temproary array)
//TC: O(2n+k)=O(n)
//SC: O(k)






// class rotateByD{
//   public static void leftRotateByD(int[] arr, int k){
//     int n=arr.length;
//     k=k%n;
//     for(int i=0; i<k; i++){
//       int temp=arr[0];
//       for(int j=0; j<n-1; j++){
//         arr[j]=arr[j+1];
//       }
//       arr[n-1]=temp;
//     }
//     printArray(arr);
//   }
//   public static void printArray(int[] arr){
//     System.out.println("Rotated Array: ");
//     for(int i=0; i<arr.length; i++){
//       System.out.print(arr[i]+" ");
//     }
//   }
//   public static void main(String ar[]){
//     int[] arr={1,2,3,4,5,6,7};
//     System.out.println("Original Array: ");
//     for(int i=0; i<arr.length; i++){
//       System.out.print(arr[i]+" ");
//     }
//     System.out.println();
//     leftRotateByD(arr, 3);
//   }
// }
//Brute force approach (one by one approach)
//TC:O(n*k)
//SC: O(1)








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
  public static void leftRotateByD(int[] arr, int k){
    int n=arr.length;
    k=k%n;
    reverseFunction(arr, 0, k-1);
    
    reverseFunction(arr, k, n-1);
    
    reverseFunction(arr, 0, n-1);
    
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
    leftRotateByD(arr, 3);
  }
}
//Oprimal solution(Reversal Approach)
//TC: O(n)
//SC: O(1)
