package java_questions.ST_3_SAMPLE_LIST;
class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class InsertionsInDLL {
    Node head;
    Node tail;

    public void insertAtHead(int data){
        Node newnode=new Node(data);
        if(head=null){
            head=tail=newnode;
        }
        else{
            newnode.next=head;
            head.prev=newnode;
            head=newnode;
        }
    }
    public void InsertAtTail(int data){
        Node newnode=new Node(data);
        if(tail==null){
            hed=tail=newnode;
        }
        else{
            tail.next=newnode;
            newnode.prev=tail;
            tail=newnode;
        }
    }
}
