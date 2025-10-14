class main{
  public static int secondLargest(int[] arr){
    int largest=Integer.MIN_VALUE;
    int secondLargest=Integer.MIN_VALUE;
    for(int i=0; i<arr.length; i++){
      if(arr[i]>largest){
        secondLargest=largest;
        largest=arr[i];
      }else if(arr[i]>secondLargest){
        secondLargest=arr[i];
      }
    }return secondLargest;
  }
  public static void main(String ar[]){
    int[] arr={12, 35, 1, 10, 4, 1};
    System.out.println("Second largest element: "+secondLargest(arr));
  }
}
//TC:O(n)
