import java.util.*;
package Random_Practise;

public class RemoveDuplicatesFromSortedList {
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public Node removeduplicates(Node head){
        NOde tmp=head;
        if(head==null){
            return null;
        }
        while(tmp!=null){
            if(tmp.data==tmp.next.data){
                Node nxt_nxt=tmp.next.next;
                Node del=tmp.next;
                delete del;
                tmp.next=nxt_nxt;
            }
            else{
                tmp=tmp.next;
            }
        }
        return head;
    }
}
