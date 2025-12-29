package Testpad.queue-1;

public class arrayimplementation {
import java.util.*;

class QueueArray
{
  static int SIZE=100;
  static int front=-1;
  static int rear=-1;
  static int array[]=new int[SIZE];
  QueueArray()
  {
    front=rear=-1;
  }
  // Method to add an item to the queue.
  void enqueue(int item)
  {
      if(rear==SIZE-1){
          return;
      }
      if(front==-1){
          front=0;
      }
      rear++;
      array[rear]=item;
  }

  // Method to remove an item from queue.
  int dequeue()
  {
      if(front==-1 || front>rear){
          return -1;
      }
      int x=array[front];
      front++;
      return x;
  }
}
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    int t, n, q1, q2;
    t = s.nextInt();
    while(t>0)
    {
      QueueArray ob1=new QueueArray();
      n = s.nextInt();
      while(n>0)
      {
        q1 = s.nextInt();
        if(q1 == 1)
        {
          q2 = s.nextInt();
          ob1.enqueue(q2);
        }
        else
          System.out.print(ob1.dequeue() + " ");
        n--;
      }
      System.out.println();
      t--;
    }
  }
}
