// class cl{
//     public static void main(String ar[]){
//         int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//         int arr1[][]={{9,8,7,6,5},{4,3,2,1,0}};
//         printSpiral(arr1);
//     }
//     public static void printSpiral(int matrix[][]){
//         int startRow=0;
//         int startCol=0;
//         int endCol=matrix.length-1;
//         int endRow=matrix[0].length-1;
//         while(startRow<=endRow && startCol<=endCol){
//             for(int j=startCol; j<=endCol;j++){
//               System.out.print(matrix[startRow][j]+" ");
//             }
//             for(int i=startRow+1;i<=endRow;i++){
//               System.out.print(matrix[i][endCol]+" ");
//             }
//             for(int j=endCol-1;j>=startCol;j--){
//                 if(startRow==endRow){
//                     return;
//                 }
//                 System.out.print(matrix[endRow][j]+" ");
//             }
//             for(int i=endRow-1; i>startRow;i--){
//                 if(startCol==endCol){
//                     return;
//                 }
//               System.out.print(matrix[i][startCol]+" ");
//             }
//             startRow++;
//             startCol++;
//             endRow--;
//             endCol--;
//         }
//         System.out.println();
//     }
// }




class cl {
    public static void main(String ar[]) {
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int arr1[][] = {{9,8,7,6,5},{4,3,2,1,0}};
        int arr2[][] = {{1,2,3},{4,5,6}};  // 2x3
        int arr3[][] = {{1},{2},{3}};       // 3x1
        int arr4[][] = {{1,2,3}};       //1x3
        
        System.out.println("4x4 Matrix:");
        printSpiral(arr);
        
        System.out.println("2x5 Matrix:");
        printSpiral(arr1);
        
        System.out.println("2x3 Matrix:");
        printSpiral(arr2);
        
        System.out.println("3x1 Matrix:");
        printSpiral(arr3);
        
        System.out.println("1x3 Matrix:");
        printSpiral(arr4);
    }
    
    public static void printSpiral(int matrix[][]) {
        if (matrix.length == 0) return;
        
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;           // Rows
        int endCol = matrix[0].length - 1;        // Columns
        
        System.out.println("Matrix " + matrix.length + "x" + matrix[0].length + ":");
        
        while (startRow <= endRow && startCol <= endCol) {
            // Top row (left to right)
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }
            
            // Right column (top to bottom)
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }
            
            // Bottom row (right to left) - only if there are multiple rows
            if (startRow < endRow) {
                for (int j = endCol - 1; j >= startCol; j--) {
                    System.out.print(matrix[endRow][j] + " ");
                }
            }
            
            // Left column (bottom to top) - only if there are multiple columns
            if (startCol < endCol) {
                for (int i = endRow - 1; i > startRow; i--) {
                    System.out.print(matrix[i][startCol] + " ");
                }
            }
            
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        System.out.println("\n");
    }
}
