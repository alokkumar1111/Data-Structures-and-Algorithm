// class Main{
//     public static void printTable(int number, int multiplier){
//         if(multiplier>10){
//             return;
//         }
//         System.out.println(number+"*"+multiplier+"="+number*multiplier);
//         printTable(3, multiplier+1);
//     }
//     public static void main(String ar[]){
//         int number=3;
//         printTable(number,1);
//     }
// }





// class Main{
//     public static int sumFirstN(int num){
//         if(num==0){
//             return 0;
//         }
//         return num+sumFirstN(num-1);
//     }
//     public static void main(String ar[]){
//         System.out.println("Sum of first n integers: "+sumFirstN(5));
//     }
// }




// class Main{
//     public static int Factorial(int num){
//         if(num==0){
//             return 1;
//         }
//         return num*Factorial(num-1);
//     }
//     public static void main(String ar[]){
//         System.out.println("Product of first n integers(Factorial): "+Factorial(5));
//     }
// }




// class Main{
//     public static int numberOfDigits(int n){
//         if(n==0){
//             return 0;
//         }
//         return 1+numberOfDigits(n/10);
//     }
//     public static void main(String ar[]){
//         System.out.println("Number of digits in the given number: "+numberOfDigits(795));
//     }
// }
