package java_questions;

import java.util.Scanner;

public class Greateroftwo {
    public static void check() {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER 1st NUMBER:");
        int a=sc.nextInt();
        System.out.println("ENTER 2nd NUMBER:");
        int b=sc.nextInt();

        if(a>b){System.out.println("1ST ONE IS GREATER");}
        else if(a<b){System.out.println("2nd ONE IS GREATER");}
        else{System.out.println("BOTH ARE EQUAL");}
        sc.close();   
    }
    public static void main(String[] args) {
        check();
    }
}
