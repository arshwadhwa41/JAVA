package Random_Practise;

import java.util.Stack;

public class PushAtBottom {
    public void pb(Stack<Integer> st,int data){
        Stack<Integer> rt=new Stack<>();

        while (!st.isEmpty()) {
            rt.push(st.pop());
        }
        st.push(data);
        while(!rt.isEmpty()){
            st.push(rt.pop());
        }
    }
}
