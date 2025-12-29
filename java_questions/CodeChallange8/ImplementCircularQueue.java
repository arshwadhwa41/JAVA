package java_questions.CodeChallange8;

public class ImplementCircularQueue {
    private final int size=4;
    private int front=-1;
    private int rear=-1;
    private int[] q=new int[size];

    void enqueue(int data){
        if((rear+1)%size==front){
            System.out.println("-2");
            return;
        }
        if(front==-1){
            front=rear=0;
        }
        else{
            rear=(rear+1)%size;
        }
        q[rear]=data;
    }

    int dequeue(){
        if(front==-1){
            return -1;
        }
        int val=q[front];
        if(front==rear){
            front=rear=-1;
        }
        else{
            front=(front+1)%size;
        }
        return val;
    }
}
