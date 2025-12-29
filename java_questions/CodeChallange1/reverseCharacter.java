package java_questions.CodeChallange1;

import java.util.Scanner;
import java.util.Stack;

public class reverseCharacter {
    public static String revchar(String str){
        Stack <Character> st=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            st.push(ch);
        }
        StringBuilder reversed=new StringBuilder();
        while(!st.isEmpty()){
            reversed.append(st.pop());
        }
        return reversed.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String res=revchar(str);
        System.out.println(res);
    }
}

/*

WITHOUT STRINGBUILDER

import java.util.Stack;

public class Main {
    public static String reverse(String str) {
        Stack<Character> stack = new Stack<>();

        // push characters using normal for loop
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        // pop characters using normal for loop
        String reversed = "";
        for (int i = 0; i < str.length(); i++) {
            reversed = reversed + stack.pop();
        }

        return reversed;
    }

    public static void main(String[] args) {
        System.out.println(reverse("hello"));
    }
}



*/