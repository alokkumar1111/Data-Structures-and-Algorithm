// public class pairSum{
//   public static int[] pairSum(int arr[], int k){
//     int n=arr.length;
//     for(int i=0; i<n; i++){
//       for(int j=i+1; j<n; j++){
//         if(arr[i]+arr[j]==k){
//           return new int[]{i,j};
//         }
//       }
//     }
//     return new int[]{-1, -1};
//   }
//   public static void main(String ar[]){
//     int arr[]={2, 7, 11, 15};
//     int k=9;
//     int result[]=pairSum(arr, k);
//     System.out.println("Sum found at "+result[0]+","+ result[1]);
//   }
// }// Brute force approach
// //TC: O(n2)
// //pairSum




class pairSum{
  public static int[] pairSum(int arr[], int k){
    int i=0, j=arr.length-1;
    while(i<j){
      int sum=arr[i]+arr[j];
      if(sum==k){
        return new int[]{i, j};
      }
      if(sum<k){
        i++;
      }else if(sum>k){
        j--;
      }
    }
    return new int[]{i,j};
  }
  public static void main(String ar[]){
    int arr[]={2, 7, 11, 15};
    int k=9;
      int result[]=pairSum(arr, k);
      System.out.println("Sum found at "+result[0]+","+ result[1]);
  }
}
//TC:O(n)
