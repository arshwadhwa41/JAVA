package java_questions.CodeChallange3;

public class LibraryCatalogCleanup {
    Static Node removeDuplicatesInDoublyList(Node head){
        if(head==null){
            return null;
        }
        Node curr=head;
        while(curr!=null && curr.next!=null){
            if(curr.data==curr.next.data){
                curr.next=curr.next.next;
            }
            else{
                curr=curr.next;
            }
        }
        return head;
    }
}
