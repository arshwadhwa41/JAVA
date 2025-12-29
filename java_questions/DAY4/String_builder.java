package java_questions.DAY4;
import java.util.*;
public class String_builder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Arsh");
        System.out.println(sb);

        //charAt
        System.out.println(sb.charAt(3));//h

        //set cahr at index
        sb.setCharAt(0, 'F');
        System.out.println(sb);//Frsh

        //insert char at index
        sb.insert(1,'a');
        System.out.println(sb);//Farsh

        //delete substr from string
        sb.delete(1, 4);//Fh :::deletes till (end-1) position as end is not inclusive.

        //append function::sb=sb+"append"
        sb.append("r");
        sb.append("a");
        sb.append("a");
        sb.append("n");

        System.out.println(sb);//Fhraan

        //string length
        System.out.println(sb.length());//6
    }

 
    public static void rev_stringbuilder(String[] args) {
        StringBuilder sb=new StringBuilder("hello");

        for(int i=0;i<sb.length()/2;i++){
            int front=i;
            int back=sb.length()-1-i;// 5-1-0 = > 4

            char frontchar=sb.charAt(front);
            char backchar=sb.charAt(back);

            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);
        }
        System.out.println(sb);//olleh
    }   
}