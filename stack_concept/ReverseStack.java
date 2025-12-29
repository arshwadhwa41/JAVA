package stack_concept;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {
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
        Stack<Integer> at=new Stack<>();
        while(!rt.isEmpty()){
            at.push(rt.pop());
        }
        while(!at.isEmpty()){
            st.push(at.pop());
        }
        while(!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }
    }
}

//ANOTHER WAY:

// public static void pb(int data,Stack<Integer>s){
    //     if(isEmpty()){
    //         s.push(data);
    //         return;
    //     }
    //     int top=s.pop();
    //     pb(data,s);
    //     s.push(top);
    // }

    // public static void reverse(Stack<Integer>s){
    //     if(s.isEmpty()){return;}
    //     int top=s.pop();
    //     reverse(s);
    //     pb(top,s);
    // }

    // public static void main(String[] args) {
    //     Stack<Integer> s=new Stack();
    //     s.push(1);
    //     s.push(2);
    //     s.push(3);
    //     s.push(4);
    //     while(!s.isEmpty()){
    //         System.out.println(s.peek);//1 2 3 4
    //         s.pop();
    //     }
    // }