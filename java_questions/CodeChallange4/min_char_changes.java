package java_questions.CodeChallange4;

import java.util.Scanner;

public class min_char_changes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            char prev=str.charAt(i-1);
            if(curr==prev){
                count++;
            }
        }
        System.out.println(count);
    }
}
