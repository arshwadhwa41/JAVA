package Queue_Concept;

import Queue_Concept.ArrayImplementation.QArray;

public class LinkedListImplementation {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static class queueLL{
        Node head=null;
        Node tail=null;
        int size=0;

        public void add(int x){
            Node tmp=new Node(x);
            if(size==0){
                head=tail=tmp;
            }
            else{
                tail.next=tmp;
                tail=tmp;
            }
            size++;
        }

        public int peek(){
            if(size==0){
                System.out.print("Queue is Empty!");
                return -1;
            }
            return head.val;
        }

        public int remove(){
            if(size==0){
                System.out.print("Queue is Empty!");
                return -1;
            }
            int x=head.val;
            head=head.next;
            size--;
            return x;
        }

        public void display(){
            if(size==0){
                System.out.print("Queue is Empty!");
                return;
            }
            Node tmp=head;
            while(tmp!=null){
                System.out.print(tmp.val+" ");
                tmp=tmp.next;
            }
        }
        public boolean isEmpty(){
            if(size==0){
                System.out.print("Queue is Empty!");
                return true;
            }
            return false;
        }
    }
    public static void main(String[] args) {
        queueLL q=new queueLL();
        System.out.println(q.isEmpty());//true
        q.add(1);
        System.out.println(q.isEmpty());//false
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        System.out.println(q);//[1,2,3,4,5,6]
        q.remove();
        System.out.println(q);//[1,2,3,4,5]
        q.remove();
        System.out.println(q);//[2,3,4,5]
        System.out.println(q.peek());//2
        System.out.println(q.peek());//2
        System.out.println(q.size());//4
    }
}
