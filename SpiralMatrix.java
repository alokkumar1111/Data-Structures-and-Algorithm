class cl{
    public static void main(String ar[]){
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        printSpiral(arr);
    }
    public static void printSpiral(int matrix[][]){
        int startRow=0;
        int startCol=0;
        int endCol=matrix.length-1;
        int endRow=matrix[0].length-1;
        while(startRow<=endRow && startCol<=endCol){
            for(int j=startCol; j<=endCol;j++){
              System.out.print(matrix[startRow][j]+" ");
            }
            for(int i=startRow+1;i<=endRow;i++){
              System.out.print(matrix[i][endCol]+" ");
            }
            for(int j=endCol-1;j>=startCol;j--){
                if(startRow==endRow){
                    return;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            for(int i=endRow-1; i>startRow;i--){
                if(startCol==endCol){
                    return;
                }
              System.out.print(matrix[i][startCol]+" ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        System.out.println();
    }
}
