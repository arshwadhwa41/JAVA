package java_questions.CodeChallange7;

public class ReverseAltKnodesInList {
    static Node revAltK(Node head,int k){
        Node curr=head;
        Node next=null;
        Node nxt=null;
        int count=0;

        while(count<=k && curr!=null){
            nxt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;
        }
        while(curr!=null){
            head.next=curr;
        }
        count=0;
        while(count<k-1 && curr!=null){
            curr=curr.next;
            count++;
        }
        if(curr!=null){
            curr.next=revAltK(curr.next, k)
        }
        return prev;
    }
}
