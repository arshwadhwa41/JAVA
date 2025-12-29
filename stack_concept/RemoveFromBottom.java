package stack_concept;

import java.util.Scanner;
import java.util.Stack;

public class RemoveFromBottom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        int n;
        System.out.println("enter number of elements you want to put in a STACK:");
        n=sc.nextInt();
        System.out.println("enter those numbers:");
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            st.push(x);
        }
        Stack<Integer> rt=new Stack<>();
        //removes out all elements execept first and push it to rt stack
        while(st.size()>1){
            rt.push(st.pop);
        }

        st.pop();//now remove first element from st stack

        //and now all the element came back to st stack in same order except the first element
        while(!rt.isEmpty()){
            st.push(rt.pop);
        }

        //print the st stack now
        while(!st.isEmpty()){
            System.out.println(st.peek);
            st.pop();
        }
    }
}
