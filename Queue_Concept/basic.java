package Queue_Concept;

import java.util.Queue;

public class basic {
    public static void main(String[] args) {
        Queue<Integer> q=new Queue<>();
        System.out.println(q.isEmpty());//true
        q.add(1);
        System.out.println(q.isEmpty());//false
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        System.out.println(q);//[1,2,3,4,5,6]
        q.poll();
        System.out.println(q);//[1,2,3,4,5]
        q.remove();
        System.out.println(q);//[2,3,4,5]
        System.out.println(q.peek());//2
        System.out.println(q.element());//2
        System.out.println(q.size());//4
    }
}
