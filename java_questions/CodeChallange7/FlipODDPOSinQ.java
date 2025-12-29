package java_questions.CodeChallange7;

import java.util.Queue;

import Random_Practise.ArrayImplementationOfStack.Stack;

public class FlipODDPOSinQ {
    static void flipHalfQ(Queue<Integer> q){
        Stack<Integer> st=new Stack<>();
        int n=q.size();
        for(int i=0;i<n;i++){
            int val=q.remove();
            if(i%2==1){
                st.push(val);
            }
            q.add(val);
        }
        for(inti=0;i<n;i++){
            int val=q.remove();
            if(i%2==1){
                q.add(st.pop());
            }
            else{
                q.add(val);
            }
        }
    }
}
