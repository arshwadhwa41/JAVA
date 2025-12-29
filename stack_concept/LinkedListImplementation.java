package stack_concept;

public class LinkedListImplementation {
    //user defined datatype
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    } 

    //user defineed data structure
    public static class LinkedListStack{
        private Node head = null;
        private int size=0;
        
        void push(int x){
            Node tmp=new Node(x);
            tmp.next=head;
            head=tmp;
            size++;
        }

        int pop(){
            if(head==null){
                System.out.println("Stack is Empty!");
                return -1;
            }
            int x=head.val;
            head=head.next;
            return x;
        }

        int peek(){
            if(head==null){
                System.out.println("Stack is Empty!");
                return -1;
            }
            return head.val;
        }

        void displayrec(Node h){
            if(h==null){
                return
            }
            displayrec(h.next);
            System.out.print(h.val+" ");
        }
        void display(){
            displayrec(head);
            System.out.println();
        }

        
        void print(Node head){
            if(head==null){
                System.out.println("stack is Empty!");
                return;
            }
            Node tmp=head;
            while(tmp!=null){
                System.out.println(tmp.val+" ");
                tmp=tmp.next;
            }
            System.out.println();
        }

        void reversedisplay(){
            Node tmp=head;
            while(tmp!=null){
                System.out.println(tmp.val+" ");
                tmp=tmp.next;
            }
            System.out.println();
        }

        //getter
        int size(){
            return size;
        }

        boolean isEmpty(){
            if(size==0){return true;}
            return false;
        }
    }
    public static void main(String[] args) {
        LinkedListStack<Integer> st=new LinkedListStack();
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
