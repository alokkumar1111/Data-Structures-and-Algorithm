// class main{
//   public static int minSubarraySum(int arr[]){
//     int minSum=Integer.MAX_VALUE;
//     int currSum=0;
//     for(int i=0; i<arr.length; i++){
//       currSum+=arr[i];
//       if(minSum>currSum){
//         minSum=currSum;
//       }
//       if(currSum>0){
//         currSum=0;
//       }
//     }return minSum;
//   }
//   public static void main(String ar[]){
//     int[] arr={1, 3, 5, 7, 9};
//     int[] arr1={-1, 2, -3, 4, -5};
//     int[] arr2={-1, -2, -3, -4, -5};
//     System.out.println("Minimum Subarray Sum: "+minSubarraySum(arr));
//     System.out.println("Minimum Subarray Sum: "+minSubarraySum(arr1));
//     System.out.println("Minimum Subarray Sum: "+minSubarraySum(arr2));
//   }
// }
