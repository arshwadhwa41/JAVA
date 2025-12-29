package java_questions.ST_3_SAMPLE_LIST;

public class reverseList {
    static Node rev(Node head){
        Node prev=null;
        Node curr=head;
        while(curr!=null){
            Node newnode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=newnode;
        }
        return prev;
    }
}
