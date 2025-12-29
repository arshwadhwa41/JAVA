import java.util.Stack;

public class UnderflowOverflow {
    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        //MAKING UNDERFLOW CONDITION:

        System.out.println(st);//1 2 3 4 5 
        st.pop();
        System.out.println(st);//1 2 3 4
        st.pop();
        System.out.println(st);//1 2 3
        st.pop();
        System.out.println(st);//1 2
        st.pop();
        System.out.println(st);//1
        st.pop();
        System.out.println(st);//[]

        // st.pop();  ==> ERROR : shows empty stack error
        // st.peek();  ==> ERROR
        // st.push();  ==> No ERROR
        // st.size();  ==> 0
        // System.out.println(st);
    }
}
