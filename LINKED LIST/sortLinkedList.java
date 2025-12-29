public class sortLinkedList {
    public static Node bubblesort(Node head){
        for(Node i=head;i.next!=null;i=i.next){
            for(Node j=i.next;j!=null;j=j.next){
                if(i.data>j.data){
                    Node t=i.data;
                    i.data=j.data;
                    j.data=t;
                }
            }
        }
        return head;
    }
}
