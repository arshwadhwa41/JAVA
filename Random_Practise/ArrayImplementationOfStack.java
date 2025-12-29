package Random_Practise;

public class ArrayImplementationOfStack {
    public static class Stack{
        private int[] arr=new int[4];
        int idx==-1;
        public boolean isFull(){
            if(idx==arr.length){
                return true;
            }
            return false;
        }
        public void push(int dd){
            if(isFull()){
                System.out.println("full");
            }
            arr[idx]=dd;
            idx++;
        }
        public boolean isEmpty(){
            if(arr.length==0){
                return true;
            }
            return false;
        }
        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;
        }
        public int peek(){
            return arr[idx-1];
        }
        public void display(){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack();
        st.push(4);
        st.display();//4 

        st.push(5);
        st.display();//4 5

        st.push(1);
        st.display();//4 5 1

        System.out.println(st.size());//3

        st.pop();
        st.display();//4 5

        System.out.println(st.size());//2

        st.push(7);
        st.push(0);
        st.isFull();//true
        st.push(100);//stack is full
    }
}
