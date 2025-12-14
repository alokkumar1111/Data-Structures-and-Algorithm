class Main{
  
  public static void displayMatrix(int[][] nums){
     for(int i=0; i<nums.length; i++){
        for(int j=0; j<nums.length; j++){
           System.out.print(nums[i][j]+" ");
        }System.out.println();
      }
  }
  
  public static void rotateImage(int[][] nums){
      for(int i=0; i<nums.length; i++){
        for(int j=i; j<nums[0].length; j++){
           int temp=nums[i][j];
           nums[i][j]=nums[j][i];
           nums[j][i]=temp;
        }
      }
    
    for(int i=0; i<nums.length; i++){
      int left=0, right=nums[0].length-1;
      while(left<right){
        int temp=nums[i][left];
        nums[i][left]=nums[i][right];
        nums[i][right]=temp;
        left++;
        right--;
      }
    }
    displayMatrix(nums);
  }
  public static void main(String ar[]){
    int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
    rotateImage(arr);
  }
}
