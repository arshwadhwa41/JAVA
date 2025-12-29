package Testpad.Stack-1;

import java.util.Stack;


public class EvaluatePostFix {
    public static int evalpost(String exp){
        Stack<Integer>st=new Stack<>();

        for(int i=0;i<=exp.length()-1;i++){
            char ch=exp.charAt(i);
            if(Character.isDigit(ch)){
                st.push(ch-'0');
            }
            else if(ch==' '){
                continue;
            }
            else{
                int op1=st.pop();
                int op2=st.pop();

                switch(ch){
                    case '+':st.push(op1+op2);break;
                    case '-':st.push(op1-op2);break;
                    case '*':st.push(op1*op2);break;
                    case '/':st.push(op1/op2);break;
                    case '^':st.push((int)Math.pow(op1,op2));break;
                }
            }
        }
        return st.pop();
    }
}
