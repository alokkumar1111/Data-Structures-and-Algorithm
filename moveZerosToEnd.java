// class moveZerosToEnd{
//   public static void moveZeros(int[] arr){
//     int n=arr.length;
//     int index=0;
//     int[] temp=new int[n];
//     for(int i=0; i<n; i++){
//       if(arr[i]!=0){
//         temp[index++]=arr[i];
//       }
//     }while(index<n){
//       temp[index++]=0;
//     }
//     printArray(temp);
//   }
//   public static void printArray(int[] arr){
//     System.out.println("Formated array: ");
//     for(int i=0; i<arr.length; i++){
//       System.out.print(arr[i]+" ");
//     }
//     System.out.println();
//   }
//   public static void main(String ar[]){
//     int[] arr={0,3,1,0,9};
//     System.out.println("Array: ");
//     for(int i=0; i<arr.length; i++){
//       System.out.print(arr[i]+" ");
//     }
//     System.out.println();
//     moveZeros(arr);
//   }
// }
//Brute force Approach
//TC:O(n)
//SC:O(n)





// class moveZerosToEnd{
//   public static void moveZeros(int[] arr){
//     int n=arr.length; 
//     int index=0;
//     for(int i=0; i<arr.length; i++){
//       if(arr[i]!=0){
//         arr[index++]=arr[i];
//       }
//     }while(index<arr.length){
//       arr[index++]=0;
//     }printArray(arr);
//   }
//   public static void printArray(int[] arr){
//     System.out.println("Formated array: ");
//     for(int i=0; i<arr.length; i++){
//       System.out.print(arr[i]+" ");
//     }
//     System.out.println();
//   }
//   public static void main(String ar[]){
//     int[] arr={0,3,1,0,9};
//     System.out.println("Array: ");
//     for(int i=0; i<arr.length; i++){
//       System.out.print(arr[i]+" ");
//     }
//     System.out.println();
//     moveZeros(arr);
//   }
// }
//Better Approach
//TC: O(n)
//SC: O(1)





class MoveZerosOptimal {
    public static void moveZeros(int[] arr) {
        int j = 0; // next position for non-zero

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12, 0};
        moveZeros(arr);
        System.out.print("After moving zeros: ");
        for (int x : arr) System.out.print(x + " ");
    }
}
