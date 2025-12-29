package java_questions.CodeChallange3;

import java.util.Scanner;

public class CompressString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        int n=str.length();
        for(int i=0;i<n;){
            char c=str.charAt(i);
            int count=1;
            int j=i+1;
            while(j<n && str.charAt(j)==c){
                count++;
                j++;
            }
            sb.append(c);
            if(count>1){
                sb.append(count);
            }
            i=j;
        }
        return sb.toString();
    }
}
