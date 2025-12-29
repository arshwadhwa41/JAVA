package java_questions.CodeChallange9;

import java.util.ArrayList;
import java.util.HashSet;

public class IntersectionOfTwoLists {
    public static Node intersection(Node head1,Node head2){
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> list=new ArrayList<>();

        Node tmp=head1;
        while(tmp!=null){
            set.add(tmp.data);
            tmp=tmp.next;
        }
        tmp=head2;
        while(tmp!=null){
            if(set.contains(tmp.data)){
                list.add(tmp.data);
                set.remove(tmp.data);
            }
            tmp=tmp.next;
        }
        java.util.Collecetions.sort(list);
        Node dummy=new Node(0);
        Node curr=dummy;
        for(int val:list){
            curr.next=new Node(val);
            curr=curr.next;
        }
        return dummy.next;
    }
}
