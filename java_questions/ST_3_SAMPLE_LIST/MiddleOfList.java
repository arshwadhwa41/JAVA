package java_questions.ST_3_SAMPLE_LIST;

public class MiddleOfList {
    public static Node middle(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node t=head;
        int c=0;
        while(t!=null){
            c++;
            t=t.next;
        }
        int mid=c/2;
        int k=0;
        t=head;
        while(t!=null){
            if(k==mid){
                return t;
            }
            t=t.next;
            k++;
        }
        return null;
    } 
}
