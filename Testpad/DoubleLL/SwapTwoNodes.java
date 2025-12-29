package Testpad.DoubleLL;

public class SwapTwoNodes {
    Node swapNodes(Node head, int x, int y) {
        class Node{
          int data;
          Node next;
          Node prev;
          Node(int d){
            data=d;
          }
        }
        if (x == y) return head;

        Node nodeX = head;
        Node nodeY = head;

        // Find nodeX
        while (nodeX != null && nodeX.data != x) {
            nodeX = nodeX.next;
        }

        // Find nodeY
        while (nodeY != null && nodeY.data != y) {
            nodeY = nodeY.next;
        }

        if (nodeX == null || nodeY == null)
            return head;

        // If nodeX is not head
        if (nodeX.prev != null)
            nodeX.prev.next = nodeY;
        else
            head = nodeY;

        // If nodeY is not head
        if (nodeY.prev != null)
            nodeY.prev.next = nodeX;
        else
            head = nodeX;

        // Swap prev pointers
        Node temp = nodeX.prev;
        nodeX.prev = nodeY.prev;
        nodeY.prev = temp;

        // Swap next pointers
        temp = nodeX.next;
        nodeX.next = nodeY.next;
        nodeY.next = temp;

        // Fix next.prev
        if (nodeX.next != null)
            nodeX.next.prev = nodeX;

        if (nodeY.next != null)
            nodeY.next.prev = nodeY;

        return head;
    }
}
