class maximumConsecutiveOnes{
  public static int countMaxConsecutiveOnes(int[] nums){
    int count=0;
    int max1=0;
    for(int num : nums){
      if(num==1){
        count++;
        max1=Math.max(max1, count);
      }else{
        count=0;
      }
    }return max1;
  }
  public static void main(String ar[]){
    int[] arr={1,1,0,0,1,1,1,0,1,1};
    System.out.println("Maximum Consecutive One: "+countMaxConsecutiveOnes(arr));
  }
}
//Optimal approach
//TC: O(n)
