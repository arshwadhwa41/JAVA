package Testpad.LinkedList;

import java.util.Scanner;

public class addTwoNumbers {
    /* 
  class Node {
    int data;
    Node next;
    Node(){}
    Node(int d) {
      data=d;
    }
  }
  
  The above class defines the linked list node.
*/

class Result {
  // Return the head of sum list
  static Node addListNumbers(Node head1, Node head2) {
    // Write your code here
      Node dummy=new Node(0);
      Node tmp=dummy;
      int carry=0;
    while(head1!=null || head2!=null || carry!=0){
        int sum=carry;
        if(head1!=null){
            sum+=head1.data;
            head1=head1.next;
        }
        if(head2!=null){
            sum+=head2.data;
            head2=head2.next;
        }
        sum+=carry;
        carry=sum/10;
        tmp.next=new Node(sum%10);
        tmp=tmp.next;
    }
      return dummy.next;
  }
}
class Node {
  int data;
  Node next;
  Node(){}
  Node(int d) {
    data=d;
  }
}

class Main {
  static Node insertEnd(Node head, int data) {
    Node newLink = new Node(data);
    newLink.next = null;   // link new node to NULL as it is last node
    Node last = head;
    if (head == null)  // if list is empty add in beginning.
    {
      head = newLink;
      return head;
    }
    while (last.next != null)  // Find the last node
      last = last.next;
    last.next = newLink;  // Add the node after the last node of list
    return head;
  }

  static void forwardPrint(Node head)   {
    Node current = head; // start at beginning of list
    while(current != null) // until end of list,
    {
      System.out.print(current.data + " "); // print data
      current = current.next; // move to next link
    }
  }

  public static void main(String[] args) {
    int t,n,m,x;
    Scanner s = new Scanner(System.in);
    t=Integer.parseInt(s.nextLine().trim());
    while(t>0) {
      Node head = null, head2=null, t1;
      n = s.nextInt();
      while(n>0) {
        m = s.nextInt();
        head = insertEnd(head, m);
        n--;
      }
      n = s.nextInt();
      while(n>0) {
        m = s.nextInt();
        head2 = insertEnd(head2, m);
        n--;
      }
      t1 = Result.addListNumbers(head, head2);
      forwardPrint(t1);
      System.out.println();
      t--;
    }
  }
}
}
