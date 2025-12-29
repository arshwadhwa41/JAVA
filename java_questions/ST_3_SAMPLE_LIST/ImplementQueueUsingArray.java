package java_questions.ST_3_SAMPLE_LIST;

import java.util.*;
public class ImplementQueueUsingArray {

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

  int dequeue()
  {
    if(front>rear || front!=null){
        return -1;
    }
    int x=array[front];
    front++;
    return x;
  }
}
}
