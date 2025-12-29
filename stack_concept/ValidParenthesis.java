package stack_concept;

import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=str.length();
        Stack <Character> st=new Stack<>();
        for(char i=0;i<n;i++){
            char ch=str.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){
                st.push(str[i]);
            }
            else{
                if(!st.isEmpty()){
                    char top=st.peek();
                    if(top=='}' && ch=='{'||top==']' && ch=='['||top==')' && ch=='('){
                        st.pop();
                    }
                }
                else{
                    return false;
                }
            }
        } 
        if(st.isEmpty()){
            return true;
        }
    }
}
