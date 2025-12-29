package Random_Practise;

import java.util.Stack;

public class MinStack {
    Stack<Integer> st=new Stack<>();
    Stack<Integer> rt=new Stack<>();

    public void push(int dd){
        if(st.size()==0){
            st.push(dd);
            rt.push(dd);
        }
        else{
            st.push(dd);
            if(dd>rt.peek()){
                rt.push(rt.peek());
            }
            else{
                rt.push(dd);
            }
        }
    }
    public void pop(){
        st.pop();
        rt.pop();
    }
    public int top(){
        return st.peek();
    }
    public int getMin(){
        return rt.peek();
    }
}
