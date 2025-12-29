package Testpad.queue-1;

public class ReversefirstNelementsofagivenqueue {
    static void reverseKelementsQueue(QueueArray q, int K)
{
    Stack<Integer> st = new Stack<>();

    for (int i = 0; i < K; i++) {
        int val = q.dequeue();
        if (val != -1) {
            st.push(val);
        }
    }

    while (!st.isEmpty()) {
        q.enqueue(st.pop());
    }

    int remaining = q.rear - q.front + 1;

    for (int i = 0; i < remaining; i++) {
        q.enqueue(q.dequeue());
    }
}
}
