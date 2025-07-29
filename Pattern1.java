import java.util.*;
class Main{
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int s=1; s<=n; s++){
                if(s==i){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        // for(int i=1; i<=n; i++){
        //     for(int s=1; s<=n; s++){
        //         if(s+i==n+1 || s==i ){
        //             System.out.print("*\t");
        //         }
        //         else{
        //             System.out.print("\t");
        //         }
        //     }
        //     System.out.println();
        // }
    }
}
