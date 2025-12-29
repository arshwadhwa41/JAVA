package stack_concept;

import java.util.Scanner;

public class InsertAtBottom {
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
        System.out.println("enter element you want to insert at bottom:");
        int bot=sc.nextInt();
        //rt:extra stack got the reverse values
        Stack<Integer> rt=new Stack<>();
        while(st.size()>0){
            rt.push(st.pop());
        }
        //insert element at bottom
        st.push(bot);
        //again put values back in same stack in same order
        while(rt.size()>0){
            st.push(rt.pop());
        }
        System.out.println(st);
    }
}
