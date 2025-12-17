// import java.util.ArrayList;
// import java.util.List;
// import java.util.Arrays;
// class Main{
//   public static int[] rearrangeElements(int[] nums){
//       List<Integer> pos=new ArrayList<>();
//       List<Integer> neg=new ArrayList<>();
      
//       for(int x: nums){
//         if(x>0) pos.add(x);
//         else neg.add(x);
//       }
      
//       int[] result=new int[nums.length];
//       int i=0;
      
//       for(int k=0; k<pos.size(); k++){
//           result[i++]=pos.get(k);
//           result[i++]=neg.get(k);
//       }return result;
//   } 
//   public static void main(String ar[]){
//     int[] nums={3,1,-2,-5,2,-4};
//     int[] result=rearrangeElements(nums);
//     for(int i=0; i<nums.length; i++){
//       System.out.print(result[i]+" ");
//     }
//   }
// }
//Brute force approach
//O(n)
//O(n)



class main{
  public static int[] rearrangeBetter(int[] nums){
    int n=nums.length;
    int posIdx=0;
    int negIdx=1;
    
    int[] result=new int[nums.length];
    for(int x: nums){
      if(x>0){
        result[posIdx]=x;
        posIdx+=2;
      }else{
        result[negIdx]=x;
        negIdx+=2;
      }
    }return result;
  }
  
  public static void main(String ar[]){
    int[] nums={3,1,-2,-5,2,-4};
    int[] result=rearrangeBetter(nums);
    for(int i=0; i<nums.length; i++){
      System.out.print(result[i]+" ");
    }
  }
}
//Better approach
//TC: O(n)
//SC: O(n)
