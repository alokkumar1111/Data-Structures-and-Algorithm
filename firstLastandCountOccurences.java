// class cl{
//   public static int firstOccurences(int[] arr, int target){
//     int low=0;
//     int high=arr.length-1;
//     int ans=-1;
    
//     while(low<=high){
//       int mid=low+(high-low)/2;
//       if(arr[mid]==target){
//         ans=mid;
//         high=mid-1;
//       }else if(arr[mid]<target){
//         low=mid+1;
//       }else{
//         high=mid-1;
//       }
//     }return ans;
//   }
//   public static int lastOccurences(int[] arr, int target){
//     int low=0;
//     int high=arr.length-1;
//     int ans=-1;
//     while(low<=high){
//       int mid=low+(high-low)/2;
//       if(arr[mid]==target){
//         ans=mid;
//         low=mid+1;
//       }else if(arr[mid]<target){
//         low=mid+1;
//       }else{
//         high=mid-1;
//       }
//     }return ans;
//   }







class Solution {
    public static int[] searchRange(int[] arr, int target) {
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        int[] range=new int[2];
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                ans=mid;
                high=mid-1;
            }else if(arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        range[0]=ans;
        low=0;
        high=arr.length-1;
        ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                ans=mid;
                low=mid+1;
            }else if(arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        range[1]=ans;
        return range;
    }
  public static void main(String ar[]){
    int[] arr={1,1,2,2,2,2,3,3,4,5,5};
    // System.out.println("first Occurence at index: "+firstOccurences(arr,2));
    // System.out.println("Last Occurence at index: "+lastOccurences(arr,2));
    int[] range=searchRange(arr,6);
    
    int count=0;
    if(range[0]!=-1){
         count=range[1]-range[0]+1;
    }
    System.out.println("First Occurence at index: "+range[0]);
    System.out.println("Last Occurence at index: "+range[1]);
    System.out.println("Number of Occurences: "+count);
  }
}
