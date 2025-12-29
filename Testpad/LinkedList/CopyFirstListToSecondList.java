package Testpad.LinkedList;

public class CopyFirstListToSecondList {
  class Node {
    int data;
    Node next;
    Node(){}
    Node(int d) {
      data=d;
    }
  }

static Node copyList(Node head) {
  // Write your code here
  
    Node tmp=head;
    Node res=null;
    Node dummy = null;
    while(tmp!=null){
        Node newnode=new Node(tmp.data);
        if(dummy==null){
            res=newnode;
            dummy=newnode;
        }
        else{
            res.next=newnode;
            res=newnode;
        }
        tmp=tmp.next;
    }
    return dummy;
}   
}
