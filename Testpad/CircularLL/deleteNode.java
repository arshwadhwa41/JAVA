package Testpad.CircularLL;

public class deleteNode {
    
  class LinkList
  {
    int data;
    LinkList next;
    LinkList(int d)
    {
      data=d;
    }
  }
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
  
static LinkList deleteBeg(LinkList head){
  // Write your code here
    if(head==null){
        return null;
    }
    if(head.next==head){
        return null;
    }
    LinkList tmp=head;
    while(tmp.next!=head){
        tmp=tmp.next;
    }
    tmp.next=head.next;
    return head.next;
}
static LinkList deleteEnd(LinkList head){
  // Write your code here
    if(head==null){
        return null;
    }
    if(head.next==head){
        return null;
    }
    LinkList tmp=head;
    LinkList prev=null;
    while(tmp.next!=head){
        prev=tmp;
        tmp=tmp.next;
    }
    prev.next=head;
    return head;
}
public static void main(String[] args)
{
  int t,n,m,x,y,i=0;
  Scanner s = new Scanner(System.in);
  LinkList head = null, t1, t2;
  n = s.nextInt();
  while(n>0){
    m = s.nextInt();
    head = insertBeg(head, m);
    n--;
  }
  int q = s.nextInt();
  while(q-- > 0){
    int choice = s.nextInt();
    if(choice == 1){
      head = deleteBeg(head);
    }else if(choice == 2){
      head = deleteEnd(head);
    }else{
      System.out.println("Wrong Input");
      System.exit(0);
    }
  }
  traverse(head);
  System.out.println();
}
}