package java_questions.ST_3_SAMPLE_LIST;

public class RemoveNthNodeOfList {
    public static Node remove(Node head,int n){
        int len=0;
        Node tmp=head;
        while(tmp!=null){
            len++;
            tmp=tmp.next;
        }
        if(len==n){
            return head.next;
        }
        int rem=len-n-1;
        tmp=head;
        for(int i=0;i<rem;i++){
            tmp=tmp.next;
        }
        tmp.next=tmp.next.next;
        return head;
    }
}
