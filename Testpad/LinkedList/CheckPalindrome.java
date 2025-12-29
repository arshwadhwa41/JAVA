package Testpad.LinkedList;

public class CheckPalindrome {
    class Node {
       int data;
       Node next;
       Node(int d) {
         data=d;
       }
    }
  static int checkPalindrome(Node head) {
    // Write your code here
    if(head==null || head.next==null){
        return 1;
    }
      
      Node slow=head;
      Node fast=head;
      while(fast!=null && fast.next!=null){
          slow=slow.next;
          fast=fast.next.next;
      }
      Node secondhalf=reverse(slow);
      
      Node p1=head;
      Node p2=secondhalf;
      
      while(p2!=null){
          if(p1.data!=p2.data){
              return 0;
          }
          p1=p1.next;
          p2=p2.next;
      }
      return 1;
  }
    static Node reverse(Node head){
        Node prev=null;
        Node curr=head;
        
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    } 
}
