package stack_concept;

import java.util.ArrayList;
import java.util.Stack;

public class StackInArrayList {

    static class Stack{
        ArrayList<Integer>list =new ArrayList<>();
        
        public static boolean isempty(){
            return list.size()==0;
        }

        public static void push (int data){
            list.add(data);
        }

        public static int pop(){
            if(isempty()){
                return -1;
            }
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        public static int peek(){
            if(isempty()){
                return -1;
            }
            return list.get(list.size()-1);            
        }
    }
    public static void main(String[] args) {
        Stack<E> s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while(!s.isEmpty()){
            System.out.println(s.peek);//4 3 2 1
            s.pop();
        }
    }
}
