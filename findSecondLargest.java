
// import java.util.Arrays;
// class findSecondLargest{
//   public static int secondLargest(int[] arr){
//     if(arr.length<2){
//       return -1;
//     }
//     Arrays.sort(arr);
//     int largest=arr[arr.length-1];
//     for(int i=arr.length-2; i>=0; i--){
//       if(arr[i]<largest){
//         return arr[i];
//       }
//     }
//     return -1;
//   }
//   public static void main(String ar[]){
//     int[] arr={12, 35, 1, 10, 4, 1};
//     int[] arr1 = {5, 9, 1, 7, 9, 3};
//     System.out.println("Second largest element: "+secondLargest(arr));
//     System.out.println("Second largest element: "+secondLargest(arr1));
//   }
// }
//Brute force approach
//TC:O(n log n)+n





// class findSecondLargest{
//   public static int secondLargest(int[] arr){
    
//     //First Pass:largest element
//     int largest=Integer.MIN_VALUE;
//     for(int num:arr){
//       if(num>largest){
//         largest=num;
//       }
//     }
    
//     //Second Pass:second largest element
//     int secondLargest=Integer.MIN_VALUE;
//     for(int num:arr){
//       if(num>secondLargest && num<largest){
//         secondLargest=num;
//       }
//     }
//     return (secondLargest==Integer.MIN_VALUE)?-1:secondLargest;
//   }
//   public static void main(String ar[]){
//     int[] arr={12, 35, 1, 10, 4, 1};
//     System.out.println("Second largest element: "+secondLargest(arr));
//   }
// }
//Better approach (Two passes)
//TC:O(n)



// class findSecondLargest{
//   public static int secondLargest(int[] arr){
//     int largest=Integer.MIN_VALUE;
//     int secondLargest=Integer.MIN_VALUE;
//     for(int i=0; i<arr.length; i++){
//       if(arr[i]>largest){
//         secondLargest=largest;
//         largest=arr[i];
//       }else if(arr[i]>secondLargest){
//         secondLargest=arr[i];
//       }
//     }
//     return secondLargest;
//   }
//   public static void main(String ar[]){
//     int[] arr={12, 35, 1, 10, 4, 1};
//     System.out.println("Second largest element: "+secondLargest(arr));
//   }
// }
//Optimal approch(Single Pass)
//TC:O(n)
