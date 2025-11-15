class Main{
  public static int longestSubarraySumLessThanK(int[] nums, int key){
    int n=nums.length;
    int maxLen=0;
    for(int i=0; i<n; i++){
      int sum=0;
      for(int j=i; j<n; j++){
        sum+=nums[j];
        if(sum<key){
          maxLen=Math.max(maxLen, j-i+1);
        }else{
          break;
        }
      }
    }return maxLen;
  }
  public static void main(String ar[]){
    int[] nums1 = {2, 1, 4, 3, 5};
    int k1 = 7;
    System.out.println("Longest subarray with sum less than key value length: "+longestSubarraySumLessThanK(nums1,k1));
  }
}
//Brute force approach
//TC: O(n2)
