class recursionExercise{
  public static int friendsPairingProblem(int n){
    if(n==1 || n==2){
      return n;
    }
    int fnm1=friendsPairingProblem(n-1);
    
    
    int fnm2=friendsPairingProblem(n-2);
    int pairWays=(n-1)*fnm2;
    
    int totWays=fnm1+pairWays;
    return totWays;
  } 
  public static int tilingProblem(int n){
    if(n==0 || n==1){
      return 1;
    }
    
    
    int fnm1=tilingProblem(n-1);
    
    int fnm2=tilingProblem(n-2);
    
    
    int totWays=fnm1+fnm2;
    return totWays;
  }
  public static String removeDuplicatesAZ(String str){
    if(str==null || str.isEmpty()){
      return str;
    }
    boolean[] visited=new boolean[26];
    StringBuilder result=new StringBuilder();
    for(int i=0; i<str.length(); i++){
      char currChar=str.charAt(i);
      if(currChar>='a' && currChar<='z'){
        int index=currChar-'a';
        if(!visited[index]){
          visited[index]=true;
          result.append(currChar);
        }
      }
    }
    return result.toString();
  } 
  public static void main(String ar[]){
    System.out.println("No of ways to pair friends or remain single: "+friendsPairingProblem(3));
    System.out.println("Total no of ways to tile: "+tilingProblem(4));
    System.out.println("New string after removing duplicates: "+removeDuplicatesAZ("apnacollege"));
    System.out.println("New string after removing duplicates: "+removeDuplicatesAZ(""));
  }
}
