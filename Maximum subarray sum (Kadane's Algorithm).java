// class Main{
//     public static void subarraySum(int[] arr, int s, int e){
//                 int sum=0;
//                 for(int k=s; k<=e; k++){
//                     sum+=arr[k];
//                     System.out.print(arr[k]);
//                     if(k<e){
//                         System.out.print(", ");
//                     }
//                 }
//                 System.out.print("  ="+sum);
//                 System.out.println();
//     }
//     public static void main(String ar[]){
//         int[] arr={1,3,5,7,9};
//         System.out.println("Subarray pattern with its sum: ");
//         int totalSubarrays=0;
//         for(int i=0; i<arr.length; i++){
//             for(int j=i; j<arr.length; j++){
//                 subarraySum(arr, i, j);
//                 totalSubarrays++;
//             }
//             System.out.println();
//         }
//         System.out.println("Total subarrays: "+totalSubarrays);
//     }
// }





// class Main{
//     public static int maxSubarraySum(int[] arr, int s, int e){
//                 int sum=0;
//                 for(int k=s; k<=e; k++){
//                     sum+=arr[k];
//                     System.out.print(arr[k]);
//                     if(k<e){
//                         System.out.print(", ");
//                     }
//                 }
//                 System.out.println();
//                 return sum;
//     }
//     public static void main(String ar[]){
//         int[] arr={1,3,5,7,9};
        
//         int sum2=Integer.MIN_VALUE;
//         int totalSubarrays=0;
//         for(int i=0; i<arr.length; i++){
//             for(int j=i; j<arr.length; j++){
//                 int sum1=maxSubarraySum(arr, i, j);
//                 if(sum1>sum2){
//                   sum2=sum1;
//                 }
//                 totalSubarrays++;
//             }
//             System.out.println();
//         }
//         System.out.println("Total subarrays: "+totalSubarrays);
//         System.out.println("Maximum subarray sum: "+sum2);
//     }
// } //Brute force approach





// class main{
//   public static int maxSubarraySum(int arr[]){
//     int maxSum=Integer.MIN_VALUE;
//     for(int i=0; i<arr.length; i++){
//       int currSum=0;
//       for(int j=i; j<arr.length; j++){
//         currSum+=arr[j];
//       }
//       if(currSum>maxSum){
//         maxSum=currSum;
//       }
//     }
//     return maxSum;
//   }
//   public static void main(String ar[]){
//     int arr[]={1, 3, 5, 7, 9};
//       System.out.println("Maximum Subarray Sum with Optimized Brute Force Approach: "+maxSubarraySum(arr)); 
//   }
// }





class Main{
  public static int maxSubarraySum(int[] arr){
    int currSum=0;
    int maxSum=Integer.MIN_VALUE;
    for(int i=0; i<arr.length; i++){
      currSum+=arr[i];
       if(currSum>maxSum){
        maxSum=currSum;
      }
      if(currSum<0){
        currSum=0;
      }
    }
    return maxSum;
  }
  public static void main(String ar[]){
    int arr[]={1, 3, 5, 7, 9};
    System.out.println("Maximum subarray sum (with Kadane's Algorithm): "+maxSubarraySum(arr));
  }
}//Kadane's Algorithm
