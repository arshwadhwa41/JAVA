package java_questions.ST_3_SAMPLE_LIST;

import Random_Practise.Stack;

public class ReverseStringUsingStack {
    public static String rev(String str){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            st.push(ch);
        }
        StringBuilder rev=new StringBuilder();
        while(!st.isEmpty()){
            rev.append(st.pop());
        }
        return rev.toString();
    }    
}
