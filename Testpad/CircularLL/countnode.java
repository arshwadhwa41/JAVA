package Testpad.CircularLL;

import java.util.Scanner;

public class countnode {
    /* 
 *  class Node {
 *    int data;
 *    Node next;
 *  };
 *
 *  The above class defines the linked list node.
 */

class Result {
  static int countNodes(Node head) {
    // Write your code here
      if(head==null){
          return 0;
      }
      int count=1;
      Node tmp=head;
      while(tmp.next!=head){
          count++;
          tmp=tmp.next;
      }
    return count; 
  }
}
class Node {
  int data;
  Node next;
  Node() {}
  Node(int d) {
    data=d;
  }
}

class Main
{
  static Node _last = null;
  
  static Node insertEnd(Node head, int data)
  {
    Node newLink = new Node(data);

    if (head != null)
      _last.next = newLink;
    else
      head = newLink;
    newLink.next = head;
    _last = newLink;
    return head;
  }

  public static void traverse(Node first)
  {
    Node temp = first;
    if (first != null)
    {
      // Keep printing nodes till we reach the first node again
      do
      {
        System.out.print(temp.data + " "); // print data
        temp = temp.next;
      }
      while (temp != first);
    }
  }
  public static void main(String[] args)
  {
    int t,n,m,x,y,i=0;
    Scanner s = new Scanner(System.in);
    t=Integer.parseInt(s.nextLine().trim());
    while(t>0)
    {
      Node head = null, t1, t2;
      n = s.nextInt();
      while(n>0)
      {
        m = s.nextInt();
        head = insertEnd(head, m);
        n--;
      }
      x = Result.countNodes(head);
      System.out.println(x);
      t--;
    }
  }
}
}
