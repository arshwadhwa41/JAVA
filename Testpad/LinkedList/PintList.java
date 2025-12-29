package Testpad.LinkedList;

import java.util.Scanner;

public class PintList {
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
        }
    }
    public static void forwardPrint(Node head){
        Node tmp=head;
        while(tmp!=null){
            System.out.println(tmp.data);
            tmp=tmp.next;
        }
    }
    public static void backwardPrint(Node head){
        if(head!=null){            
            return;
        }
        backwardPrint(head.next);
        System.out.println(head.data);
    }
}