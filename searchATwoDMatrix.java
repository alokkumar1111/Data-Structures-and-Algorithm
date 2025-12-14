// class Main{
//   public static boolean searchATwoDMatrix(int[][] arr, int target){
//     int startRow=0, endRow=arr.length-1;
//     int m=arr.length, n=arr[0].length;
//     while(startRow<=endRow){
//       int midRow=startRow+(endRow-startRow)/2;
//       if(target>=arr[midRow][0] && target<=arr[midRow][n-1]){
//         return searchARow(arr, midRow, target);
//       }else if(target>arr[midRow][n-1]){
//         startRow=midRow+1;
//       }else if(target<arr[midRow][0]){
//         endRow=midRow-1;
//       }
//     }return false;
//   }
  
  
//   public static boolean searchARow(int[][] arr, int row, int key){
//     int n=arr[0].length;
//     int st=0, end=n-1;
//     while(st<=end){
//       int mid=st+(end-st)/2;
//       if(key==arr[row][mid]){
//         return true;
//       }
//       if(key>arr[row][mid]){
//         st=mid+1;
//       }else if(key<arr[row][mid]){
//         end=mid-1;
//       }
//     }
//     return false;
//   }
//   public static void main(String ar[]){
//     int[][] arr={{1,3,5,7},{11,13,15,19},{23,30,34,60}};
//     System.out.println("Element found in the matrix: "+searchATwoDMatrix(arr, 34));
//   }
// }







// class Main{
//   public static boolean searchATwoDMatrixII(int[][] arr, int target){
//     int n=arr[0].length;
//     int r=0, c=n-1;
//     while(c>0 && r<arr.length){
//       if(target==arr[r][c]){
//         return true;
//       }
//       if(target<arr[r][c]){
//         c--;
//       }else if(target>arr[r][c]){
//         r++;
//       }
//     }
//     return false;
//   }public static void main(String ar[]){
//     int[][] arr={{1,3,5,7},{11,13,15,19},{23,30,34,60}};
//     System.out.println("Element found in the matrix: "+searchATwoDMatrixII(arr, 34));
//     System.out.println("Element found in the matrix: "+searchATwoDMatrixII(arr, 29));
//   }
// }






****
class Main{
    public static int[] searchA2DMatrix(int[][] nums, int target){
       int m=nums.length;
       int n=nums[0].length;
       
       int low=0;
       int high=m*n-1;
       while(low<=high){
         int mid=low+(high-low)/2;
         int row=mid/n;
         int col=mid%n;
         if(nums[row][col]==target){
           return new int[] {row,col};
         }else if(nums[row][col]<target){
           low=mid+1;
         }else{
           high=mid-1;
         }
       }return new int[]{-1,-1};
    }
  public static void main(String ar[]){
      int[][] nums={{0, 1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11}};
      int[] ans=searchA2DMatrix(nums, 10);
      System.out.println("Search a 2D Matrix: "+ans[0]+","+ans[1]);
    }
}
//Leetcode
******








import java.util.Arrays;
class Main{
  public static int[] searchSpirally(int[][] arr, int target){
    int sRow=0, sCol=0, eRow=arr.length-1, eCol=arr[0].length-1;
    while(sRow<eRow && sCol<eCol){
       for(int i=sCol; i<=eCol; i++){
          if(target==arr[sRow][i]){
              return new int[]{sRow,i};
          }
       }
       for(int i=sRow+1; i<=eRow; i++){
          if(target==arr[i][eCol]){
              return new int[]{i,eCol};
          }
       }
       for(int i=eCol-1; i>=sCol; i--){
           if(target==arr[eRow][i]){
               return new int[]{eRow,i};
           }
       }
       for(int i=eRow-1; i>sRow; i--){
            if(target==arr[i][sCol]){
                return new int[]{i,sCol};
            }
        }
        sRow++;
        eRow--;
        sCol++;
        eCol--;
        // // Bottom row (right to left) - if rows remain
        //     if(sRow <= eRow){
        //         for(int i = eCol; i >= sCol; i--){
        //             if(target == arr[eRow][i]){
        //                 return new int[]{eRow, i};
        //             }
        //         }
        //         eRow--;
        //     }
            
        //     // Left column (bottom to top) - if columns remain
        //     if(sCol <= eCol){
        //         for(int i = eRow; i >= sRow; i--){
        //             if(target == arr[i][sCol]){
        //                 return new int[]{i, sCol};
        //             }
        //         }
        //         sCol++;
        //     }
    }
    return new int[]{-1,-1};
  }
  public static void main(String ar[]){
    int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
     int[] result=searchSpirally(arr, 7);
     System.out.println("Target element found in the matrix at: "+Arrays.toString(result));
  }
}
