package java_questions.CodeChallange3;

import java_questions.CodeChallange3.CreateNonRedundantList.Node;

public class CheckPalindrome {
    static int CheckPalindrome(Node head){
        if(head==null){
            return 0;
        }
        Node slow=head;
        Node fast=head;

        while(fast!=null &&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node secondHalf=rev(slow);
        Node p1=head;
        Node p2=secondHalf;
        while(p2!=null){
            if(p1.data!=p2.data){
                return 0;
            }
            p1=p1.next;
            p2=p2.next;
        } 
        return 1;
    }

    private static Node rev(Node head){
        Node prev=null;
        Node curr=head;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}
