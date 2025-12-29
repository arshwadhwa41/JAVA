package Testpad.Stack-1;

public class LinkedListImplementation {
{
  public int data; // data item
  public LinkList next; // next link in list
  public LinkList(int dd) // constructor
  { data = dd; }
} 

class LinkStack
{
  private LinkList first; // ref to first item on list
  public LinkStack() // constructor
  {
      first=null;
  }

  public boolean isEmpty()
  {
      return (first==null);
  }

  public void push(int dd)
  {
      LinkList tmp=new LinkList(dd);
      tmp.next=first;
      first=tmp;
  }

  public int pop()
  {
      if(isEmpty()){
          return -1;
      }
      int x=first.data;
      first=first.next;
      return x;
  }
}
}
