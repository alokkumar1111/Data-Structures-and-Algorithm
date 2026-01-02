import java.util.*;

public class Main {
  
    public static int kthMissingElement(int[] nums, int k){
      int low=0; int high=nums.length-1;
      while(low<=high){
        int mid=low+(high-low)/2;
        int missing=nums[mid]-(mid+1);
        if(missing<k){
          low=mid+1;
        }else{
          high=mid-1;
        }
      }return low+k;
    }
    
    
    public static void main(String[] args) {
      int[] nums={2, 3, 4, 7, 11};
      int[] nums1={1,2,3,4,5};
      System.out.println("Kth Missing Element: "+kthMissingElement(nums, 5));
      System.out.println("Kth Missing Element: "+kthMissingElement(nums1, 5));
  }
}
