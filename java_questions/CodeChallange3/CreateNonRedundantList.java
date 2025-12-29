package java_questions.CodeChallange3;

import java.util.HashSet;

public class CreateNonRedundantList {
    class Node{
        Node next;
        int data;
        Node(int data){
            this.next=null;
            this.data=data;
        }
    }
    Static Node DistinctList(Node head){
        HashSet<Integer> hs=new HashSet<>();
        Node curr=head;
        Node prev=null;
        if(head==null){
            return null;
        }
        while(curr!=null){
            if(hs.contains(curr.data)){
                prev.next=curr.next;
            }
            else{
                hs.add(curr.data);
                prev=curr;
            }
            curr=curr.next;
        }
        return head;
    }
}
