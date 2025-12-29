package Testpad.String;

import java.util.Scanner;

public class ReverseString {
    public static String revOrder(String str){
        String[] word=str.trim().split("\\s+");
        String res="";

        for(int i=word.length-1;i>=0;i--){
            res+=word[i];
            if(i!=0){
                res+=" ";
            }
            return res;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String str=sc.nextLine();
            System.out.println(revOrder(str));
        }
    }
}
