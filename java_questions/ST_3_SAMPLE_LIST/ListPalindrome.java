package java_questions.ST_3_SAMPLE_LIST;

public class ListPalindrome {
    public static Boolean palin(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            Node sechalf=rev(slow);
            Node p1=head;
            Node p2=sechalf;

            while(p2!=null){
                if(p1.data!=p2.data){
                    return false;
                }
                p1=p1.next;
                p2=p2.next;
            }
            return true;
        }
    }
    public static Node rev(Node head){
        Node prev=null;
        Node curr=head;
        while(curr!=null){
            Node ne=curr.next;
            curr.next=prev;
            prev=curr;
            curr=ne;
        }
        return prev;
    }
}
