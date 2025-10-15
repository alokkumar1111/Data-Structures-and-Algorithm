// class Main{
//   public static int searchMaxRowSum(int[][] arr){
//     int maxRowSum=Integer.MIN_VALUE;
//     for(int i=0; i<arr.length; i++){
//       int rowSum=0;
//       for(int j=0; j<arr[i].length; j++){
//         rowSum+=arr[i][j];
//       }if(rowSum>maxRowSum){
//         maxRowSum=rowSum;
//       }
//     }
//     return maxRowSum;
//   }
//   public static void main(String ar[]){
//       int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
//       int resultSum=searchMaxRowSum(arr);
//       System.out.println("Maximum row sum: "+resultSum);
//   }
// }






  
class Main{
  public static int searchMaxColumnSum(int[][] arr){
    int maxColumnSum=Integer.MIN_VALUE;
    for(int i=0; i<arr[0].length; i++){
      int columnSum=0;
      for(int j=0; j<arr.length; j++){
        columnSum+=arr[j][i];
      }if(columnSum>maxColumnSum){
        maxColumnSum=columnSum;
      }
    }
    return maxColumnSum;
  }
  public static void main(String ar[]){
    int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
    int resultSum=searchMaxColumnSum(arr);
    System.out.println("Maximum column search: "+resultSum);
  }
}
