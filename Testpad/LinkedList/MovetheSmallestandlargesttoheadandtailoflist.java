package Testpad.LinkedList;

public class MovetheSmallestandlargesttoheadandtailoflist {
  
    class Node
    {
       int data;
       Node next;
       Node(int d)
    {
       data=d;
    }
    }
    public static Node shiftSmallLarge(Node head) {

        if (head == null || head.next == null)
            return head;

        // ---------- STEP 1: Find and move smallest to head ----------
        Node prev = null, cur = head;
        Node small = head, prevSmall = null;

        while (cur != null) {
            if (cur.data < small.data) {
                small = cur;
                prevSmall = prev;
            }
            prev = cur;
            cur = cur.next;
        }

        // Move smallest to head
        if (small != head) {
            prevSmall.next = small.next;
            small.next = head;
            head = small;
        }

        // ---------- STEP 2: Re-Find largest in UPDATED LIST ----------
        prev = null;
        cur = head;
        Node large = head, prevLarge = null;

        while (cur != null) {
            if (cur.data > large.data) {
                large = cur;
                prevLarge = prev;
            }
            prev = cur;
            cur = cur.next;
        }

        // ---------- STEP 3: Move largest to tail ----------
        // If largest already last, nothing to do
        if (large.next != null) {

            // Remove large from its place
            if (prevLarge != null)
                prevLarge.next = large.next;
            else
                head = large.next; // largest was head

            // Find the tail
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;

            // Place large at end
            large.next = null;
            temp.next = large;
        }

        return head;
    }
}
