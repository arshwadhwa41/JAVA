public class addtwonumbers {
    public static Node listadd(Node l1,Node l2){
        Node dummy=new Node();
        Node tmp=dummy;
        int carry=0;
        while(l1!=null || l2!=null ||carry!=0){
            int sum=0;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            sum+=carry;
            carry=sum/10;
            Node newnode=new Node (sum%10);
            tmp.next=newnode;
            tmp=tmp.next;
        }
        return dummy.next;
    }
}
