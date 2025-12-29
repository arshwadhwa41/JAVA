package Testpad.CircularLL;

import java.util.Scanner;

public class splitList {
/* class LinkList {
  int data;
  LinkList next;
  LinkList() {}
  LinkList(int d) {
    data=d;
  }
} */
class Result {
  static LinkList listCut(LinkList head) {
    // Write your code here
      if(head==null){
          return null;
      }
    LinkList tmp=head;
      int count=1;
    while(tmp.next!=head){
        count++;
      tmp=tmp.next;
    }
      int split=count/2;
      tmp=head;
      int i=1;
      while(i<split){
          tmp=tmp.next;
          i++;
      }
      LinkList sec=tmp.next;
      tmp.next=head;
      
      LinkList last=sec;
      while(last.next!=head){
          last=last.next;
      }
      last.next=sec;
      return sec;
  }
}
class LinkList {
  int data;
  LinkList next;
  LinkList() {}
  LinkList(int d) {
    data=d;
  }
}

class Main
{
  // Insert in Beginning
  static LinkList insertBeg(LinkList head, int data)
  {
    LinkList newLink = new LinkList(data);
    LinkList t = head;
    newLink.next = head;   // link new node at beginning of list
    if (head != null)
    {
      while(t.next != head)
        t = t.next;
      t.next = newLink;
    }
    else
      newLink.next = newLink;
    head = newLink;  // Change the head to new node.
    return head;
  }
  // Insert in end
  static LinkList insertEnd(LinkList head, int data)
  {
    LinkList newLink = new LinkList(data);
    LinkList last = head;
    newLink.next = null;   // link new node to NULL as it is last node
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

  public static void traverse(LinkList first)
  {
    LinkList temp = first;
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
      LinkList head = null, t1, t2;
      n = s.nextInt();
      while(n>0)
      {
        m = s.nextInt();
        head = insertBeg(head, m);
        n--;
      }
      t1 = Result.listCut(head);
      traverse(head);
      System.out.println();
      traverse(t1);
      System.out.println();
      t--;
    }
  }
}    
}
