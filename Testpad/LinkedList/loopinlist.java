package Testpad.LinkedList;

import java.util.Scanner;

public class loopinlist {

class Node
{
  int data;
  Node next;
  Node(int d)
  {
    data=d;
  }
}

/* 
 *  class Node {
 *    int data;
 *    Node next;
 *  };
 *
 *  The above class defines the linked list node.
 */

class Result {
  static int loopInList(Node head) {
    // Write your code here
      if(head==null){
          return 0;
      }
      Node fast=head;
      Node slow=head;
      while(fast!=null && fast.next!=null){
          fast=fast.next.next;
          slow=slow.next;
          if(slow==fast){
              int count=1;
              fast=fast.next;
              while(fast!=slow){
                  fast=fast.next;
                  count++;
              }
              return count;
          }
      }
    return 0;
  }
}

class Main
{
  static Node _last = null;
  static Node insertEnd(Node head, int data)
  {
    Node newLink = new Node(data);
    newLink.next = null;   // link new node to NULL as it is last node
    if (head == null)  // if list is empty add in beginning.
    {
      head = newLink;
      _last = head;
      return head;
    }
    _last.next = newLink;  // Add the node after the last node of list
    _last = newLink;
    return head;
  }

  static void forwardPrint(Node head)
  {
    Node current = head; // start at beginning of list
    while(current != null) // until end of list,
    {
      System.out.print(current.data + " "); // print data
      current = current.next; // move to next link
    }
  }
  public static void main(String[] args)
  {
    int t,n,m;
    Scanner s = new Scanner(System.in);
    t=Integer.parseInt(s.nextLine().trim());
    while(t>0)
    {
      _last = null;
      Node head = null;
      Node t1, t2;
      int x, ans;
      n = s.nextInt();
      while(n>0)
      {
        m = s.nextInt();
        head = insertEnd(head, m);
        n--;
      }
      x = s.nextInt();
      if (x == -1 && _last != null)
        _last.next = null;
      else if (head != null) {
        Node curr = head;
        while (curr != null && x-- > 0)
          curr = curr.next;
        _last.next = curr;
      }
      ans = Result.loopInList(head);
      System.out.println(ans);
      t--;
    }
  }
}    
}
