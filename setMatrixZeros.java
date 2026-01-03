// class Main{
//   public static void displayMatrix(int[][] matrix){
//     for(int i=0; i<matrix.length; i++){
//       for(int j=0; j<matrix[i].length; j++){
//         System.out.print(matrix[i][j]+" ");
//       }
//       System.out.println();
//     }
//   }
//   public static void markRow(int[][] matrix, int i){
//     for(int j=0; j<matrix[i].length; j++){
//       if(matrix[i][j]!=0){
//         matrix[i][j]=-1;
//       }
//     }
//   }
//   public static void markColumn(int[][] matrix, int j){
//     for(int i=0; i<matrix.length; i++){
//       if(matrix[i][j]!=0){
//         matrix[i][j]=-1;
//       }
//     }
//   }
  
  
//   public static void setZeros(int[][] matrix){
//     for(int i=0; i<matrix.length; i++){
//       for(int j=0; j<matrix[i].length; j++){
//         if(matrix[i][j]==-1){
//           matrix[i][j]=0;
//         }
//       }
//     }
//   }
//   public static void setMatrixZeros(int[][] matrix){
//     for(int i=0; i<matrix.length; i++){
//       for(int j=0; j<matrix[i].length; j++){
//         if(matrix[i][j]==0){
//           markRow(matrix,i);
//           markColumn(matrix,j);
//         }
//       } 
//     }setZeros(matrix);
//   }
//   public static void main(String ar[]){
//     int[][] matrix={{0,1,2,0},{3,4,5,2},{1,3,1,5}};
//     setMatrixZeros(matrix);
//     displayMatrix(matrix);
//   }
// }
//Tc: O((n*m)*(n+m)*(n*m))







// class Main{
//   public static void displayMatrix(int[][] matrix){
//     for(int i=0; i<matrix.length; i++){
//       for(int j=0; j<matrix[i].length; j++){
//         System.out.print(matrix[i][j]+" ");
//       }System.out.println();
//     }
//   }
//   public static void setMatrixZeros(int[][] matrix){
//     boolean[] column=new boolean[matrix[0].length];
//     boolean[] row=new boolean[matrix.length];
//     for(int i=0; i<matrix.length; i++){
//       for(int j=0; j<matrix[i].length; j++){
//         if(matrix[i][j]==0){
//           column[j]=true;
//           row[i]=true;
//         }
//       }
//     }
    
//     for(int i=0; i<matrix.length; i++){
//       for(int j=0; j<matrix[i].length; j++){
//         if(row[i] || column[j]){
//           matrix[i][j]=0;
//         }
//       }
//     }
//     displayMatrix(matrix);
//   }
  // public static void main(String ar[]){
  //   int[][] matrix={{0,1,2,0},{3,4,5,2},{1,3,1,5}};
  //   setMatrixZeros(matrix);
  // }
// }
//TC:O((n*m)+(n*m))

