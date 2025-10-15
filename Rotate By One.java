class rotateByOne{
  public static int[] rotateLeftByOne(int[] arr){
    int temp=arr[0];
    for(int i=0; i<arr.length-1; i++){
      arr[i]=arr[i+1];
    }
    arr[arr.length-1]=temp;
    return arr;
  }
  public static int[] rotateRightByOne(int[] arr){
    int temp=arr[arr.length-1];
    for(int i=arr.length-1; i>0; i--){
      arr[i]=arr[i-1];
    }
    arr[0]=temp;
    return arr;
  }
  public static void main(String ar[]){
    int[] arr={1, 3, 9, 5};
    System.out.println("Array: ");
    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
    int[] rotated1=rotateLeftByOne(arr);
    System.out.println("Left rotated: ");
    for(int i=0; i<rotated1.length; i++){
      System.out.print(rotated1[i]+" ");
    }
    System.out.println();
    
    
    
    int[] rotated2=rotateRightByOne(arr);
    System.out.println("Right rotated: ");
    for(int i=0; i<rotated2.length; i++){
      System.out.print(rotated2[i]+" ");
    }
  }
