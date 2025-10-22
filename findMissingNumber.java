// import java.util.Arrays;
// class missingNumber {
//     public static int missingNum(int arr[]) {
//         // code here
//         int num=1;
//         Arrays.sort(arr);
//         for(int i=0; i<arr.length; i++){
//             if(arr[i]!=num){
//                 return num;
//             }num++;
//         }return -1;
//     }
//     public static void main(String ar[]){
//       int[] arr={4,3,2,5,1,7};
//       System.out.println("Missing number: "+missingNum(arr));
//     }
// }
//TC:O(n log n)






class missingNumber{
  public static int missingNum(int[] arr){
    int n=arr.length+1;
    int totalSum=n*(n+1)/2;
    int arraySum=0;
    for(int num:arr){
      arraySum+=num;
    }
    int num=totalSum-arraySum;
    return num;
  }
  public static void main(String ar[]){
      int[] arr={4,3,2,5,1,7};
      System.out.println("Missing number: "+missingNum(arr));
  }
}//TC:O(n)
