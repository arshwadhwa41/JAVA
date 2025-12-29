package java_questions.CodeChallange1;

import java.util.Scanner;

public class reverseWords {
    public static String revwords(String str){
        String words[]=str.trim().split("//s+");
        int st=0;
        int end=words.length-1;
        while(st<end){
            String t=words[st];
            words[st]=words[end];
            words[end]=t;
            st++;
            end--;
        }
        return String.join(" ",words);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String res=revwords(str);
        System.out.println(res);
    }
}
