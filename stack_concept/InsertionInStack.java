package stack_concept;

import java.util.Scanner;

public class InsertionInStack {
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
        System.out.println("enter index on which element you want to insert?");
        int in=sc.nextInt();
        System.out.println("enter element you want to insert");
        int bot=sc.nextInt();
        //rt:extra stack got the reverse values
        Stack<Integer> rt=new Stack<>();
        while(st.size()>in){
            rt.push(st.pop());
        }
        st.push(bot);
        while(rt.size()>0){
            st.push(rt.pop());
        }
        System.out.println(st);
    }    
}
