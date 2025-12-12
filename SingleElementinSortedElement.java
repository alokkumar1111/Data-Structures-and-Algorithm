class cl{
  public static int nonDuplicate(int[] nums){
    int xor=0;
    for(int x:nums){
        xor^=x;
    }
    return xor;
  }
  
  
 public static int nonDuplicateOptimized(int[] nums){
   int low=0;
   int high=nums.length-1;
   while(low<high){
         int mid=low+(high-low)/2;
         if(mid%2==1){
           mid--;
         }
         if(nums[mid]==nums[mid+1]){
           low=mid+2;
         }else{
           high=mid;
         }
   }
   return nums[low];
 }
  public static void main(String ar[]){
    int[] arr={1,1,2,2,3,3,4,5,5};
    System.out.println("Single element: "+nonDuplicate(arr));
    System.out.println("Single element: "+nonDuplicateOptimized(arr));
  }
}
