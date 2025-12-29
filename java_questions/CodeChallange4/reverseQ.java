package java_questions.CodeChallange4;

import Random_Practise.Stack;

public class reverseQ {
    class QueueArray {

        static int SIZE = 10;
        static int front = -1;
        static int rear = -1;
        static int array[] = new int[SIZE];

        // Enqueue
        void enqueue(int item) {
            if (rear == SIZE - 1) return;  // queue full
            if (front == -1) front = 0;
            array[++rear] = item;
        }

        // Dequeue
        int dequeue() {
            if (front == -1 || front > rear) return -1;  // queue empty
            return array[front++];
        }

        static void rev(QueueArray q){
            if(front==-1){
                return;
            }
            java.util.Stack<Integer> st=new Stack<>();
            int n=q.rear-q.front;
            for(int i=0;i<n;i++){
                st.push(q.dequeue());
            }
            while(!st.isEmpty()){
                q.enqueue(st.pop());;
            }
        }
    }
}
