class Recursion1{
    public static void printInc(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        printInc(n-1);
        System.out.println(n);
    }
    public static int Factorial(int n){
        if(n==0){
            return 1;
        }
        int fact=n*Factorial(n-1);
        return fact;
    }  //TC: O(n), SC: O(n)
    public static int firstAddition(int n){
        if(n==1){
            return 1;
        }
        int add=n+firstAddition(n-1);
        return add;
    } // TC: O(n), SC: O(n)
    public static int fibonacci(int n){
        if(n==0||n==1){
            return n;
        }
        int fnm1=fibonacci(n-1);
        int fnm2=fibonacci(n-2);
        int fn=fnm1+fnm2;
        return fn;
    }//TC: O(2^n) SC:O(n) exponential Time Complexity
    public static boolean isSorted(int arr[], int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }// TC: O(n) SC:O(n)
    
    public static int firstOccurence(int arr1[],int key,int i){
        if(i==arr1.length){
            return -1;
        }
        if(arr1[i]==key){
            return i;
        }
        return firstOccurence(arr1, key, i+1);
    }//TC: O(n) SC:O(n)
    
    
    public static int lastOccurence(int[] arr1, int key, int i){
        if(i==arr1.length){
            return -1;
        }
        int isFound=lastOccurence(arr1, key, i+1);
        if(isFound==-1 && arr1[i]==key){
            return i;
        }
        return isFound;
    }
    
    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        int xnm1=power(x, n-1);
        int xn=x*xnm1;
        return xn;
        // return x*power(x, n-1);
        //TC: O(n)
    }
    
    public static int optimizedPower(int a, int n){
        if(n==0){
            return 1;
        }
        int halfPower=optimizedPower(a, n/2);
        int halfPowerSq=halfPower*halfPower;
        
        if(n%2!=0){
            halfPowerSq=a*halfPowerSq;
        }
        return halfPowerSq;
    }  //TC: O(log n)
    public static void main(String ar[]){
        int n=5;
        printInc(n);
        System.out.println("Factorial of the given number: "+Factorial(n));
        System.out.println("Sum of n numbers: "+firstAddition(n));
        System.out.println("nth term in Fibonacci series: "+fibonacci(n));
        System.out.println("25th term in Fibonacci series: "+fibonacci(25));
        System.out.println("26th term in Fibonacci series: "+fibonacci(26));
        System.out.println("27th term in Fibonacci series: "+fibonacci(27));
        int[] arr={1,2,3,4,5,6,7};
        System.out.println("Sorted or not: "+isSorted(arr,0));
        int[] arr1={8, 3, 6, 9, 5, 10, 2, 5, 3};
        System.out.println("Key element found at index or is it not found: "+firstOccurence(arr1,5 ,0));
        System.out.println("Last index of key element or is it not found: "+lastOccurence(arr1,5 ,0));
        System.out.println("Power: "+power(2, 5));
        System.out.println("Power calculated using Optimized Power function: "+optimizedPower(2, 10));
    }
}

