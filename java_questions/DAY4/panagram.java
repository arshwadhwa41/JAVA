package java_questions.DAY4;

import java.util.Scanner;

public class panagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine().toLowerCase();
        
        int arr[]=new int [26];
        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
            if(ch>='a' && ch<='z'){
                arr[ch-'a']++;
            }
        }
        for(int i=0;i<26;i++){
            if(a[i]==0){
                System.out.println("no");
            }
            else{
                System.out.println("yes");
            }
        }
    }
}
