package stack_concept;

import java.util.Stack;

class MinStack {
    Stack<Integer> st=new Stack<>();
    Stack<Integer> min=new Stack<>();
    public MinStack(){
        //constructor
    }    
    public void push(int val){
        if(st.size()==0){
            st.push(val);
            min.push(val);
        }
        else{
            st.push(val);
            if(min.peek()<val){
                min.push(min.peek());
            }
            else{
                min.push(val);
            }
        }
    }   
    public void pop(){
        st.pop();
        min.pop();
    }   
    public int top(){
        return st.peek();
    }   
    public void getMin(){
        return min.peek();
    }   
}
