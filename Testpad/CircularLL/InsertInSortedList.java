package Testpad.CircularLL;

import java.util.Scanner;

public class InsertInSortedList {
    

public static LinkList insertSorted(LinkList head, int data) {
    LinkList nd = new LinkList(data);

    if (head == null) {
        nd.next = nd;
        return nd;
    }

    if (head.next == head) {
        if (nd.data > head.data) {
            head.next = nd;
            nd.next = head;
            return head;
        } else {
            nd.next = head;
            head.next = nd;
            return nd;
        }
    }

    LinkList tmp = head;
    LinkList prev = null;

    while (tmp != head || prev == null) {
        // stop if we found node >= new data OR we reached the last node
        if (tmp.data >= nd.data || tmp.next == head) break;
        prev = tmp;
        tmp = tmp.next;
    }

    // ADDITIONAL FIX: if we broke at the last node and the new data is greater
    // than last node's data, then insert after last (i.e., before head).
    if (tmp.next == head && tmp.data < nd.data) {
        prev = tmp;
        tmp = tmp.next; // tmp becomes head, so nd will point to head
    }

    nd.next = tmp;

    if (prev == null) {
        // inserting before head: need to update last.next to new head
        LinkList last = head;
        while (last.next != head)
            last = last.next;
        last.next = nd;
        return nd; // new head
    }

    prev.next = nd;
    return head;
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
  static LinkList insertBeg(LinkList head, int data)
  {
    LinkList newLink = new LinkList(data);
    LinkList t = head;
    newLink.next = head;   // link new node at beginning of list
    if (head != null) {
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
  static LinkList insertEnd(LinkList head, int data) {
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

  public static void traverse(LinkList first)  {
    LinkList temp = first;
    if (first != null) {      // Keep printing nodes till we reach the first node again
      do {
        System.out.print(temp.data + " "); // print data
        temp = temp.next;
      }
      while (temp != first);
    }
  }

  public static void main(String[] args) {
    int t,n,m,x,y,i=0;
    Scanner s = new Scanner(System.in);
    t=Integer.parseInt(s.nextLine());
    while(t>0) {
      LinkList head = null, t1, t2;
      n = s.nextInt();
      while(n>0) {
        m = s.nextInt();
        head = insertBeg(head, m);
        n--;
      }
      m = s.nextInt();
      head = Result.insertSorted(head, m);
      traverse(head);
      System.out.println();
      t--;
    }
  }
}
}