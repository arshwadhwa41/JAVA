import java.util.*;
public class BalancedBrackets {
    public static int BracketsToRemoveMakingBracketsBalanced(String str){

        //the minimum number of brackets to be remove to make it balance IN THE CASE OF INBALANCE
        Stack<Character>st=new Stack<>();
        int n=str.length();
        int Closingunmatch=0;
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(ch=='('){
                st.push(ch);
            }
            else{
                if(st.size()==0){
                    Closingunmatch++;
                }
                if(st.peek()=='('){
                    st.pop();
                }
            }
        }
        int openingunmatch=st.size();
        int res=openingunmatch+Closingunmatclosing;
        return res;
    }


    public static boolean isbalanced(String str){
        Stack<Character>st=new Stack<>();
        int n=str.length();
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(ch=='('){
                st.push(ch);
            }
            else{
                if(st.size()==0){
                    return false;
                }
                if(st.peek()=='('){
                    st.pop();
                }
            }
        }
        if(st.size()>0){
            return false;
        }
        else{
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(isbalanced(str));
    }
}


/*
LEETCODE SOLUTION:

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();

        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='('||ch=='['||ch=='{'){
                st.push(ch);
            }
            else{
                if(!st.empty()){
                    char top=st.peek();
                    if((ch==')'&& top=='(')||(ch=='}'&& top=='{')||(ch==']'&& top=='[')){
                        st.pop();
                    }
                }
                else{
                    return false;
                }
            }
        }
        return st.empty();
    }
}
 */