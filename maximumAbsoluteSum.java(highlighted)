
class main{
  public static int maxAbsoluteSum(int[] nums){
    int n=nums.length;
    int maxSum=nums[0];
    int minSum=nums[0];
    
    int currSumMax=nums[0];
    int currSumMin=nums[0];
    for(int i=0; i<nums.length; i++){
      currSumMax=Math.max(nums[i], currSumMax+nums[i]);
      maxSum=Math.max(currSumMax,maxSum);
      
      
      currSumMin=Math.min(nums[i], currSumMin+nums[i]);
      minSum=Math.min(currSumMin, minSum);
    }
    return Math.max(Math.abs(maxSum), Math.abs(minSum));
  }
  public static void main(String ar[]){
    int[] arr={1,3,5,7,9};
    System.out.println("Maximum Absolute Sum: "+maxAbsoluteSum(arr));
    int[] arr1={-1,-3,-5,-7,-9};
    System.out.println("Maximum Absolute Sum: "+maxAbsoluteSum(arr1));
  }
}
