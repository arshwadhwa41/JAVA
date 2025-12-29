package java_questions.CodeChallange3;

import Random_Practise.Stack;

public class BalancedString(String s) {
    Satck<Character> st=new Stack<>();
    Satck<Integer> index=new Stack<>();

    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch=='(' || ch=='{'){
            st.push(ch);
            index.push(i);
        }
        else if(ch==')' || ch=='}'){
            if(st.isEmpty()){
                return i;
            }
            char top=st.pop();
            index.pop();
            if((ch=')' && top!='(')||(ch='}' && top!='{')){
                return i;
            }
        }
    }
    if(st.isEmpty()){
        return s.length();
    }
    return -1;
}
