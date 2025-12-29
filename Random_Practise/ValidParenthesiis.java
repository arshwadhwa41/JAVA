package Random_Practise;

import java.util.Stack;

public class ValidParenthesiis {
    public boolean isvalid(String str){
        Stack<Character> st=new Stack<>();
        int n=str.length();
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(ch=='('||ch=='['||ch=='{'){
                st.push(ch);
            }
            else{
                if(!st.isEmpty()){
                    char top=st.peek();
                    if((ch==')' && top=='(')||(ch=='}' && top=='{')||(ch==']' && top=='[')){
                        st.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        if(st.isEmpty()){
            return true;
        }
    }
}