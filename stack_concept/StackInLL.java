package stack_concept;

import java.util.Stack;

public class StackInLL {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            next=null;
        }
    }
    static class stack {
        public static Node head;
        public static boolean isempty(){
            return head==null;
        }

        public static void push(int data){
            Node newnode=new Node(data);
            if(isempty()){
                head=newnode;
                return;
            }
            newnode.next=head;
            head=newnode;
        }
        public static int pop(){
            if(isempty()){return -1;}
            int top=head.data;
            head=head.next;
            return top;
        }
        public static int peek(){
            if(isempty()){return -1;}
            return head.data;
        } 
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
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
