package Testpad.CircularLL;

import java.util.Scanner;

import Testpad.CircularLL.insertNodes.LinkList;

public class insertNodes {
    class LinkList {
        int data;
        LinkList next;
        LinkList(int d) {
            data = d;
        }
    }
    public static void traverse(LinkList first) {
        LinkList temp = first;
        if (first != null) {
            // Keep printing nodes till we reach the first node again
            do {
                System.out.print(temp.data + " "); // print data
                temp = temp.next;
            }while (temp != first);
        }
        System.out.println();
    }

    static LinkList insertBeg(LinkList head, int data) {
        // Write your code here
        LinkList ne=new LinkList(data);
        if(head==null){
            ne.next=ne;
            return ne;
        }
        LinkList tmp=head;
        while(tmp.next!=head){
            tmp=tmp.next;
        }
        tmp.next=ne;
        ne.next=head;
        return ne;
    }

    static LinkList insertEnd(LinkList head, int data) {
      // Write your code here
        LinkList ne=new LinkList(data);
        if(head==null){
            ne.next=ne;
            return ne;
        }
        LinkList tmp=head;
        while(tmp.next!=head){
            tmp=tmp.next;
        }
        tmp.next=ne;
        ne.next=head;
        return head;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = Integer.parseInt(s.nextLine().trim());
        while (t-- > 0) {
            LinkList head = null, t1, t2;
            int q = s.nextInt();
            while(q-- > 0){
                int choice = s.nextInt();
                int data = s.nextInt();
                if(choice == 1){
                    head = insertBeg(head,data);
                }else if(choice == 2){
                    head = insertEnd(head,data);
                }
            }
            traverse(head);
        }
    }
}
