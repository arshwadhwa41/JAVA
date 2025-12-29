package java_questions.ST_3_SAMPLE_LIST;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MergeTwoSortedLinkedLists {
    public static Node msl(Node head1,Node head2){
        ArrraList<Integer> arl=new ArrayList<>();
        Node curr=head1;
        while(curr!=null){
            arl.add(curr.data);
            curr=curr.next;
        }
        Node curr2=head2;
        while(curr2!=null){
            arl.add(curr2.data);
            curr2=curr2.next;
        }
        Collections.sort(arl);
        Node dummy=new Node(-1);
        Node tmp=dummy;
        for(int i=0;i<arl.size;i++){
            tmp.next=new Node(arl.get(i));
            tmp=tmp.next;
        }
        return dummy.next;
    }    
}
