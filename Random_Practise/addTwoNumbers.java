package Random_Practise;

public class addTwoNumbers {
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            Node next=null;
        }
    }
    public Node addnodes(Node l1,Node l2){
        Node dum=new Node();
        int carry=0;
        Node tmp=dum;

        while(l1!=null || l2!=null || carry!=0){
            int sum=0;

            while(l1!=0){
                sum+=l1.data;
                l1=l1.next;
            }
            while(l2!=0){
                sum+=l2.data;
                l2=l2.next;
            }
            sum+=carry;
            carry=sum/10;
            Node newnode=new Node(sum%10);
            newnode.next=tmp;
            tmp=tmp.next;
        }
        return dum.next;
    }    
}
