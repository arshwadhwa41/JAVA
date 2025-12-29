package Random_Practise;

public class RemoveNthNodeFromEnd {
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

public Node removenth(Node head, int n) {

    // Step 1: find length
    int len = 0;
    Node temp = head;

    while (temp != null) {
        len++;
        temp = temp.next;
    }

    // Step 2: If deleting the first node
    if (n == len) {
        return head.next;
    }

    // Step 3: reach the (len-n-1)th node (PREVIOUS node)
    int stop = len - n - 1; 
    temp = head;

    for (int i = 0; i < stop; i++) {
        temp = temp.next;
    }

    // Step 4: delete next node
    temp.next = temp.next.next;

    return head;
}

}
