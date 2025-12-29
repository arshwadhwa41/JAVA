package Random_Practise;

public class mergeTwoSortedLists {
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            Node next=null;
        }
    }
    public Node mergelists(Node l1,Node l2){
        Node newnode=new Node();
        Node curr=newnode;
        while(l1!=null && l2!=null){
            if(l1.data<l2.data){
                curr.next=l1.data;
                l1=l1.next;
            }
            else{
                curr.next=l2.data;
                l2=l2.next;
            }
            curr=curr.next;
        }
        if(l1!=null){
            curr.next=l1;
        }
        else{
            curr.next=l2;
        }
        return newnode.next;
    }
}
