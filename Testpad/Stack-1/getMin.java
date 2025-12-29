package Testpad.Stack-1;

public class getMin {
  public int maxSize; // size of stack array
  public int[] stackArray;
  public int top; // top of stack

  public CQStack(int s) // constructor
  {
    maxSize = s; // set array size
    stackArray = new int[maxSize]; // create array
    top = -1; // no items yet
  }
  public boolean isEmpty() // true if stack is empty
  {
    return (top == -1);
  }
  public boolean isFull() // true if stack is full
  {
    return (top == maxSize-1);
  }
  public void push(int x){
    if(top>=maxSize-2){
        return;
    }
    if(isEmpty()){
        top++;
        stackArray[top]=x;
    }
    else{
        int curMin=stackArray[maxSize-1];
        if (x<curMin) {
            top++;
            stackArray[top]=2*x-curMin;
            stackArray[maxSize-1]=x;
        }
        else{
            top++;
            stackArray[top]=x;
        }
    }
  }

  public int pop(){
    if(isEmpty()){
        return -1;
    }
    int val=stackArray[top--];
    int curMin=stackArray[maxSize-1];
    if(val<curMin){
        int poppedActual=curMin;
        int prevMin=2*curMin-val;
        stackArray[maxSize-1]=prevMin;
        return poppedActual;
    }
    else{
        return val;
    }
  }

  public int getMin(){
    if(isEmpty()){
        return -1;
    }
    return stackArray[maxSize-1];
  }
  public static void main(String[] args)
  {
    CQStack theStack = new CQStack(100); // make new stack
    Scanner s=new Scanner(System.in);
    int t, n, q1, q2;
    t = Integer.parseInt(s.nextLine().trim());
    while(t>0)
    {
      n= Integer.parseInt(s.nextLine().trim());
      while(n>0)
      {
        q1 = Integer.parseInt(s.nextLine().trim());
        if(q1 == 1){
          q2 = Integer.parseInt(s.nextLine().trim());
          theStack.push(q2);
        }
        else if(q1 == 2)
          System.out.print(theStack.pop() + " ");
        else
          System.out.print(theStack.getMin() + " ");
        n--;
      }
      System.out.print("\n");
      t--;
    }
  }
}