package Testpad.DoubleLL;
public class LinkList
{
  int data;
  LinkList next;
  LinkList prev;
} 
public class rotateListByK {
static LinkList rotateByK(LinkList head, int k)
{
    if(head==null || head.next==null || k==0){
        return head;
    }
    LinkList tmp=head;
    int len=1;
    while(tmp.next!=null){
        tmp=tmp.next;
        len++;
    }
    k=k%len;
    if(k==0){
        return head;
    }
    k=len-k;
    LinkList curr=head;
    for(int i=1;i<k;i++){
        curr=curr.next;
    }
    LinkList newhead=curr.next;
    curr.next=null;
    newhead.prev=null;
    LinkList tail=newhead;
    while(tail.next!=null){
        tail=tail.next;
    }
    tail.next=head;
    head.prev=tail;
    return newhead;
}
}