package java_questions;

import java.util.Scanner;

public class Userchoice {
    public static void choice() {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER NUMBERS YOU WANT TO INPUT :");
        int n=sc.nextInt();
        int pos=0 ;int neg=0 ;int zer=0;
        for(int i=0;i<n;i++){
            if(i==0){zer++;}
            else if(i>0){pos++;}
            else {neg++;}
        }
        System.out.println("POSITIVE NUMBER COUNT :"+pos);
        System.out.println("NEGATIVE NUMBER COUNT :"+neg);
        System.out.println("ZERO NUMBER COUNT :"+zer);
        sc.close();   
    }
    public static void main(String[] args) {
        choice();
    }
}
