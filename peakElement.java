import java.util.List;
import java.util.ArrayList;
class peakElement{
  public static List<Integer> findPeakElement(int[] arr){
    List <Integer> peaks=new ArrayList<>();
    for(int i=0; i<arr.length; i++){
      if((i==0 || arr[i]>arr[i-1]) && (i==arr.length-1 || arr[i]>arr[i+1])){
        peaks.add(arr[i]);
        // return arr[i];
      }
    }//return -1; 
    return peaks;
  } 
  //Brute force approach
  //O(n)
  
  
  
  
  public static int findPeakElementOptimal(int[] nums){

    int n=nums.length;
    if(n==1){
      return (nums[0]);
    }
    if(nums[0]>nums[1]){
      return (nums[0]);
    }
    if(nums[n-1]>nums[n-2]){
      return (nums[n-1]);
    }
    int low=1;
    int high=n-2;
    while(low<=high){
      int mid=low+(high-low)/2;
      if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
      return (nums[mid]);
      } else if(nums[mid]>nums[mid-1]){
        low=mid+1;
      }else if(nums[mid]>nums[mid+1]){
        high=mid-1;
      }
    }return -1;
  }
  
  
  public static void main(String ar[]){
    int[] arr={1, 10, 13, 7, 6, 5, 4, 2, 1, 0};
    int[] arr1={1, 3, 2, 4, 1, 5, 3};
    System.out.println("Peak Element: "+findPeakElement(arr));
    System.out.println("Peak Element: "+findPeakElement(arr1));
    System.out.println("Peak Element: "+findPeakElementOptimal(arr));
    System.out.println("Peak Element: "+findPeakElementOptimal(arr1));
  }
}






class Solution {
    public int findPeakElement(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] < nums[mid + 1]) {
                low = mid + 1;   // peak is on the right
            } else {
                high = mid;      // peak is on the left or at mid
            }
        }
        return low;  // low == high
    }
}
