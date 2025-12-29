package java_questions.CodeChallange9;

import java.util.TreeSet;

public class UnionOfLists {
    public static void union(Ndoe head1,Node head2){
        TreeSet<Integer> set=new TreeSet<>();
        while(head1!=null){
            set.add(head1.data);
            head1=head1.next;
        }
        while(head2!=null){
            set.add(head2.data);
            head2=head2.next;
        }
        Node dummy=new Node(0);
        Node curr=dummy;
        for(int val:set){
            curr.next=new Node(val);
            curr=curr.next;
        }
        return dummy.next;
    }
}
