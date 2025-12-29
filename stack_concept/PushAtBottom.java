package stack_concept;

import java.util.Stack;

public class PushAtBottom {
    public static void pb(int data,Stack<Integer>s){
        if(isEmpty()){
            return;
        }
        int top=s.pop();
        pb(data,s);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<E> s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        pb(4, s);
        while(!s.isEmpty()){
            System.out.println(s.peek);//3 2 1 4
            s.pop();
        }
    }
}