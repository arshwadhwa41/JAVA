package Testpad.Stack-1;

public class MinimumBracketReversal {
    static int minReversal(String expr){
    // Write your code here
      int n=s.length();
      if(n%2==1){
          return -1; 
      }
      Stack<Character>stack=new Stack<>();
      
      for(char ch:expr.toCharArray()){
          if(ch=='['){
              stack.push(ch);
          }
          else{
              if(!stack.isEmpty() && stack.peek()=='['){
                  stack.pop();
              }
              else{
                  sstack.push(ch);
              }
          }
      }
      int open=0,close=0;
      while(!satck.isEmpty){
          if(stack.pop()=='['){
              open++;
          }
          else{
              close++;
          }
      }
      return (open+1)/2+(close+1)/2;
  }
    public static void main(String[] args)
  {
    int t, ans;
    Scanner s=new Scanner(System.in);
    t = Integer.parseInt(s.nextLine().trim());
    while(t!=0)
    {
      String expr;
      expr = s.nextLine().trim();
      ans = Result.minReversal(expr);
      System.out.println(ans);
      t--;
    }
  }  
}
