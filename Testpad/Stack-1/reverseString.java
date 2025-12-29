/* class CQStack{
      public CQStack(int s) // constructor
      public void push(int j) // put item on top of stack
      public int pop() // take item from top of stack
      public boolean isEmpty() // true if stack is empty
      public boolean isFull() // true if stack is full
    }
    CQStack class already defined as per the above blueprint
*/

static String reverseString(CQStack s, String st)
{
    int n=st.length();
    for(int i=0;i<n;i++){
        char ch=st.charAt(i);
        s.push((int)ch);
    }
    String rev="";
    while(!s.isEmpty()){
        rev+=(char)s.pop();
    }
    return rev;
}