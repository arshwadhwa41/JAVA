package java_questions.CodeChallange6;

import java.util.Queue;

import Random_Practise.Stack;

public class reverseq {
    static void rev(Queue<E> q){
        Stack<Integer> st=new Stack<>();
        while(!q.isEmpty()){
            st.push(q.dequeue());
        }
        while(!st.isEmpty()){
            q.enqueue(st.pop());
        }
    }
}
