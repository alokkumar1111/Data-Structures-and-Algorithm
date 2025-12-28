// class cl{
//   public static boolean contains(int[] nums, int target){
//     for(int x: nums){
//       if(x==target) return true;
//     }return false;
//   }
//   public static int longestConsecutiveSequence(int[] nums){
//       if(nums.length==0){
//         return 0;
//       }
//       int n=nums.length;
//       int longest=1;
//       for(int i=0; i<nums.length; i++){
//         int curr=nums[i];
//         int count=1;
        
//         while(contains(nums, curr+1)){
//           curr++;
//           count++;
//         }
//         longest=Math.max(longest, count);
//       }return longest;
//   }
//   public static void main(String ar[]){
//     int[] nums={100, 102, 103, 4, 104, 5, 2, 3, 1, 6};
//     System.out.println("Longets Consecutive Sequence: "+longestConsecutiveSequence(nums));
//   }
// }
//Brute Force 
//TC: O(n2)
//TC: O(1)






import java.util.Arrays;
class cl{
 public static int longestConsecutiveSequenceBetter(int[] nums){
  if(nums.length==0){
    return 0;
  }
  int longest=1;
  int count=1;
  Arrays.sort(nums);
   int curr=nums[0];
  for(int i=1; i<nums.length; i++){
    if((curr+1)==nums[i]){
      count++;
      curr++;
      longest=Math.max(longest, count);
    }else{
      count=1;
      curr=nums[i];
    }
  }return longest;
 }
 public static void main(String ar[]){
    int[] nums={100, 102, 103, 4, 104, 5, 2, 3, 1, 6};
    System.out.println("Longest Consecutive Sequence: "+longestConsecutiveSequenceBetter(nums));
  }
}
//Better approach
//TC: O(n)
