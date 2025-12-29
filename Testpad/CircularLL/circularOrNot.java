package Testpad.CircularLL;
import java.util.*;
// Other imports go here
// Do NOT change the class name
class Node
{
  int data;
  Node next;
  Node(int d)
  {
    data=d;
  }
}







public class circularOrNot
{
  static Node _last = null;
  
  static Node insertEnd(Node head, int data)
  {
    Node newLink = new Node(data);
    newLink.next = null;

    if (head != null)
      _last.next = newLink;
    else
      head = newLink;
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
        System.out.println(temp.data + " "); // print data
        temp = temp.next;
      }
      while (temp != first);
    }
    System.out.println("");
  }

static int isCircular(Node head) {
    if (head == null) return 0;

    Node slow = head;
    Node fast = head;

    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;

        if (slow == fast) {
            return 1;  // cycle exists
        }
    }
    return 0;  // no cycle
}

    public static void main(String[] args)
  {
    int t,n,m,x,y,i=0;
    Scanner s = new Scanner(System.in);
    t=Integer.parseInt(s.nextLine().trim());
    while(t>0)
    {
      _last = null;
      Node head = null, t1, t2;
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
      System.out.println(isCircular(head));
      t--;
    }
  }
}