// class mergeSortedArrays{
//   public static void displayArray(int[] nums){
//     for(int i=0; i<nums.length; i++){
//       System.out.print(nums[i]+" ");
//     }
//   }
//   public static void mergeTwoArrays(int[] arr1, int[] arr2){
//     int n=arr1.length; int m=arr2.length;
//     int i=0; int j=0; int k=0;
//     int[] merged=new int[m+n];
//     while(i<n && j<m){
//       if(arr1[i]<arr2[j]){
//         merged[k++]=arr1[i++];
//       }else{
//         merged[k++]=arr2[j++];
//       }
//     }
//     while(i<n){
//       merged[k++]=arr1[i++];
//     }
//     while(j<m){
//       merged[k++]=arr2[j++];
//     }
//     displayArray(merged);
//   }
//   public static void main(String ar[]){
//     int[] arr1={1, 3, 6, 7};
//     int[] arr2={2, 4, 6, 8};
//     mergeTwoArrays(arr1, arr2);
//   }
// }







class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
    int i=m-1;
    int j=n-1;
    int k=m+n-1;
    while(i>=0 && j>=0){
        if(nums1[i]>nums2[j]){
            nums1[k--]=nums1[i--];
        }else{
            nums1[k--]=nums2[j--];
        }
    }
    while(j>=0){
        nums1[k--]=nums2[j--];
    }
    }
}
