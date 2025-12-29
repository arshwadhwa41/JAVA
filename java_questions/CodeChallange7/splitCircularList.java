package java_questions.CodeChallange7;

public class splitCircularList {
    static Node ListCut(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node head2=slow.next;
        slow.next=head;
        Node t=head2;

        while(t.next!=head){
            t=t.next;
        }
        t.next=head2;
        return head2;
    }
}
