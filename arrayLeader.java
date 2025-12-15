// class cl{
//   public static void arrayLeader(int[] nums){
    
//     for(int i=0; i<nums.length; i++){
//       boolean isLeader=true;
//       for(int j=i+1; j<nums.length; j++){
//         if(nums[j]>nums[i]){
//           isLeader=false;
//         }
//       }if(isLeader==true){
//         System.out.print(nums[i]+" ");
//       }
//     }
//   }
//   public static void main(String ar[]){
//     int[] nums={10, 22, 12, 3, 0, 6};
//     arrayLeader(nums);
//   }
// }
//Brue force approach (nested loop approach)
//O(n2) TC






import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
class cl{
  public static void arrayLeaderOptimal(int[] nums){
    int n=nums.length;
    List<Integer> leaders=new ArrayList<>();
    int maxFromRight=nums[n-1];
    leaders.add(maxFromRight);
    
    
    //System.out.print(maxFromRight+" ");
    for(int i=n-2; i>=0; i--){
      if(nums[i]>=maxFromRight){
        maxFromRight=nums[i];
        //System.out.print(maxFromRight+" ");
        leaders.add(maxFromRight);
      }
    }
    Collections.reverse(leaders);
    System.out.println(leaders);
  }
   public static void main(String ar[]){
    int[] nums={10, 22, 12, 3, 0, 6};
    arrayLeaderOptimal(nums);
  }
}
//Optimal approach
//TC: O(n)
//SC: O(n) but O(1) SC without list
