package stack_concept;

import java.util.Scanner;

public class DisplayStackRecursivley {
    public static void displayrec(Stack<Integer> st){
        if(st.size()==0){
            return;
        }
        int top=st.pop();
        displayrec(st);
        System.out.println(top+" ");
        st.push(top);
    }
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
        displayrec(st);
    }
}
