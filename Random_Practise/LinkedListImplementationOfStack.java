package Random_Practise;

import stack_concept.LinkedListImplementation.LinkedListStack;

public class LinkedListImplementationOfStack {
    public static class Node(
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    )
    public static class Stack{
        private int size=0;
        private Node head=null;

        public void push(int dd){
            Node tmp=new Node(dd);
            tmp.next=head;
            tmp=head;
            size++;
        }
        public int pop(){
            if(head==null){
                return -1;
            }
            int x=head.data;
            head=head.next;
            size--;
            return x;
        }
        public int peek(){
            if(head==null){
                return -1;
            }
            return head.data;
        }
        public void display(){
            if(head==null){
                System.out.println("empty");
            }
            Node tmp=head;
            while(tmp!=null){
                System.out.print(tmp.data+" ");
                tmp=tmp.next;
            }
        }
        public int size(){
            return size;
        }
        public boolean isEmpty(){
            if(size==0){
                return true;
            }
            return false;
        }
    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack();
        st.push(4);
        st.display();//4 

        st.push(5);
        st.display();//4 5

        st.push(1);
        st.display();//4 5 1

        System.out.println(st.size());//3

        st.pop();
        st.display();//4 5

        System.out.println(st.size());//2

        st.push(7);//4 5 7
        st.push(0);//4 5 7 0
    }
}
