class findNonRepeatingElement{
  public static int nonRepeatingElement(int[] nums){
    for(int i=0; i<nums.length; i++){
      int count=0;
      int num=nums[i];
      for(int j=0; j<nums.length; j++){
        if(nums[j]==num){
          count++;
        }
      }
     if(count==1){
       return num;
     }
    }return -1;
  }
  public static void main(String ar[]){
    int[] arr={1, 1, 2, 3, 3, 4, 4};
    System.out.println("Non-Repeating element: "+nonRepeatingElement(arr));
  }
}
