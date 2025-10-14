// class majorityElement{
//   public static int majorityElement(int[] arr){
//     int n=arr.length;
//     for(int i=0; i<arr.length; i++){
//       int count=0;
//       for(int j=0; j<arr.length; j++){
//         if(arr[j]==arr[i]){
//           count++;
//         }
//       }if(count>n/2){
//         return arr[i];
//       }
//     }
//     return -1;
//   }public static void main(String ar[]){
//     int[] arr={2, 2, 1, 1, 1, 2, 2};
//     System.out.print(majorityElement(arr));
//   }
// }
//Brute force approach
//TC:O(n2)







import java.util.Arrays;
class majorityElement{
  public static int majorityElement(int[] arr){
    if(arr.length==1){
      return arr[0];
    }
    Arrays.sort(arr);
    int n=arr.length;
    int freq=1;
    int ans=arr[0];
    for(int i=1; i<arr.length; i++){
      if(arr[i]==arr[i-1]){
        freq++;
      }else{
        freq=1;
        ans=arr[i];
      }
      if(freq>arr.length/2){
         return arr[i];
      }
    }
    return -1;
  }
  public static void main(String ar[]){
    int[] arr={2, 2, 1, 1, 1, 1, 2, 2, 2};
    System.out.println("Majority element: "+majorityElement(arr));
  }
}
//Optimal approach
//TC:O(n log n)+O(n)=O(n log n)
