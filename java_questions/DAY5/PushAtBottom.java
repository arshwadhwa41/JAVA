package java_questions.DAY5;

import java.util.Stack;

public class PushAtBottom {
    public static void pushbottom(int data,Stack<Integer>s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushbottom(data,s);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack <Integer> s= new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushbottom(4,s);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }    
}
