class Node{
    int data;
    Node prev;
    Node next;

    Node(int data){
        this.prev=null;
        this.next=null;
        this.data=data;
    }
}

public class DLL {
    Node head=null;
    Node tail=null;
    
    void insertAtHead(int data){
        Node newnode =new Node(data);
        if(head==null){
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head.prev=newnode;
        head=newnode;
    }
    void displayForward() {
        Node temp = head;
        System.out.print("Forward: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    void displayBackward() {
        Node temp = head;
        if (temp == null) return;

        // Go to last node
        while (temp.next != null) {
            temp = temp.next;
        }

        System.out.print("Backward: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
    void deleteNode(int key) {
        Node temp=head;
        int count=0;
        while(temp!=null){
            if(temp.data==key){
                return count;
            }
            else{
                temp=temp.next;
            }
        }
        temp=head;
        int check=0;
        while(temp!=null){
            if(check==count-1){
                Node pr=temp.next.next;
                temp.next=temp.next.next;
                pr.prev=temp;
            }
            else{
                temp=temp.next;
            }
        }
    }
    void insertAttail(int data){
        Node newnode=new Node(data);
        Node temp=head;
        while(head=null){
            head=newnode;
            tail=newnode;
        }
        while(temp!=null){
            temp=temp.next;
        }
        temp.next=newnode;
        newnode.prev=temp;
        tail=newnode;
    }
    
}
