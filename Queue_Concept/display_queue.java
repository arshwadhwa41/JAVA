package Queue_Concept;

import java.util.Queue;

public class display_queue {
    public static void display(q <Integer>){
        Queue<Integer> n=new Queue<>();
        while(q.size()>0){
            System.out.println(q.peek());
            n.add(q.poll());
        }
        while(n.size()>0){
            q.add(n.poll());
        }

    }
    public static void main(String[] args) {
        Queue<Integer> q=new Queue<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        display(q);
    }
}
