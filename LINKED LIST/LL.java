import java.util.*;

import org.w3c.dom.Node;
public class LL {
    Node head;
    
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            Node next=null;
        }
    }

    //add-first & last
    public void addFirst(String data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        newnode=head; 
    }
    
    public void addLast(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        Node tmp=head;
        while(tmp!=null){
            tmp=tmp.next;
        }
        tmp.next=newnode;
    }
    
    // FIX: Removed static
    public void printList(){ 
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+"->"); // FIX: Changed println to print for formatting + Added ;
            currNode=currNode.next;
        };
        System.out.println("NULL");
    }

    public void deletenode(int key) {
    // Case 1: The head node itself holds the key
        if (head != null && head.data == key) {
            head = head.next;
            return;
        }

    // Pointers for traversal
        Node currNode = head;
        Node prevNode = null;

    // Search for the key and track the previous node
    // Use == for comparing primitive int data
        while (currNode != null && currNode.data != key) {
            prevNode = currNode; // Keep track of the previous node
            currNode = currNode.next;
        }

    // Case 2: Key was found (currNode is not null)
        if (currNode != null) {
        // Skip the node: Link the previous node to the node after currNode
            prevNode.next = currNode.next;
        } 
    // Case 3: Key was NOT found (currNode is null)
        else {
            System.out.println("Node with data " + key + " not found.");
        }
    }
    
    // FIX: Removed static
    public void deleteFirst(){
        if(head==null){
            System.out.println("this list is empty"); // FIX: Added ;
            return;
        };
        head=head.next;
    }
    
    public static void main(String[] args) {
        LL list=new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();
        list.addFirst("list");
        list.printList();
        list.addFirst("this");
        list.printList();
        list.deleteFirst(); // Example of using the corrected method
        list.printList(); 
    }
}