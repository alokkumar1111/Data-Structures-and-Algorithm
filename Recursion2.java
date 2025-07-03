class Recursion2 {
    public static int tilingProblem(int n){
        if(n==0 || n==1){
            return 1;
        }
        //vertical choice
        int fnm1=tilingProblem(n-1);
        //horizantal choice
        int fnm2=tilingProblem(n-2);
        
        int totWays=fnm1+fnm2;
        return totWays;
    }
    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar=str.charAt(idx);
        if(map[currChar-'a']==true){
            removeDuplicates(str, idx+1, newStr, map);
        }
        else{
            map[currChar-'a']=true;
            removeDuplicates(str, idx+1, newStr.append(currChar), map);
        }
    }
    public static int friendsPairing(int n){
        if(n==1 || n==2){
            return n;
        }
        //single
        int fnm1=friendsPairing(n-1);
        
        //pair
        int fnm2=friendsPairing(n-2);
        int pairWays=(n-1)*fnm2;
        
        //totWays
        int totWays=fnm1+pairWays;
        return totWays;
        
        // return friendsPairing(n-1)+(n-1)*friendsPairing(n-2);
    }
    public static void printBinStrings(int n, int lastPlace, String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        if(lastPlace==0){
            printBinStrings(n-1, 0, str+"0");
            printBinStrings(n-1, 1, str+"1");
        }else{
            printBinStrings(n-1, 0, str+"0");
        }
        // printBinStrings(n-1, 0, str+"0");
        // if(lastPlace==0){
        //     printBinStrings(n-1, 1, str+"1");
        // }
    }
    public static void main(String[] args){
        System.out.println("No of ways to tile: "+tilingProblem(3));
        String str="appnnacollege";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
        System.out.println("Total ways to pair: "+friendsPairing(3));
        printBinStrings(3, 0, "");
    }
}
