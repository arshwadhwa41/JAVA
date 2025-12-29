package java_questions.ST_3_SAMPLE_LIST;

public class ImplementStackUsingArray {
class CQStack
{
  public int maxSize; // size of stack array
  public int[] stackArray;
  public int top; // top of stack

  public CQStack(int s){
    maxSize=s;
    int top=-1;
    stackArray=new int[maxSize];
  }

  public void push(int item){
    if(isFull()){
        return;
    }
    stackArray[++top]=item;
  }

  public int pop(){
    if(isEmpty()){
        return -1;
    }
    return stackArray[top--];
  }
  
  public boolean isFull(){
    return maxSize==top;
  }
  public boolean isEmpty(){
    return top==-1;
  }
} 
}
