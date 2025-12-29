package java_questions.CodeChallange5;

import java.util.HashMap;

public class DeleteGreaterinList {
    static Node DeleteGreater(Node head,int x){
        if(head==null){
            return null;
        }
        if(head.data=>x && head.next!=null){
            head=head.next;
        }
        Node curr=head;
        while(curr!=null && curr.next!=null){
            if(curr.data=>x){
                curr.data=curr.next.data;
            }
            else{
                curr=curr.next;
            }
        }
        return head;
    }
}
