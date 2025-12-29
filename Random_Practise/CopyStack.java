package Random_Practise;

import java.util.Scanner;
import java.util.Stack;

public class CopyStack {
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
        while(!st.isEmpty()){
            rt.push(st.pop());
        }
        Stack<Integer> gt=new Stack<>();
        while(!rt.isEmpty()){
            gt.push(rt.pop());
        }
        while (!gt.isEmpty()) {
            System.out.println(gt.peek());
            gt.pop();
        }
    }   
}
