package Random_Practise;

public class SwapNodeInPairs {
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public Node swapnodes(Node head){
        if(head==null ||head.next==null){
            return head;
        }
        Node dummy=new Node(0);
        dummy.next=head;

        Node prev=dummy;

        while(head.next!=null && head!=null){
            Node first=head;
            Node sec=head.next;

            prev.next=sec;
            first.next=sec.next;
            sec.next=first;

            prev=first;
            head=first.next;
        }
        return dummy.next;
    }
}
