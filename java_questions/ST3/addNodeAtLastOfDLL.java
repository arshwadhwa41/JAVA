package java_questions.ST3;

public class addNodeAtLastOfDLL {
class Node {
    int data;
    Node prev;
    Node next;

    Node(int d) {
        data = d;
        prev = null;
        next = null;
    }
}

    static Node addLast(Node head,int d){
        if(head==null){
            return null;
        }
        Node newnode=new Node(d);
        Node tmp=head;
        while(tmp.next!=null){
            tmp=tmp.next;
        }
        tmp.next=newnode;
        newnode.prev=tmp;
        newnode.next=null;
        return head;
    }
}
