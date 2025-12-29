package java_questions;

import java.util.Scanner;

public class Aveargeofthree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER 1ST NUMBER:");
        int a=sc.nextInt();
        System.out.println("ENTER 2ND NUMBER:");
        int b=sc.nextInt();
        System.out.println("ENTER 3RD NUMBER:");
        int c=sc.nextInt();

        int avg=(a+b+c)/3;
        System.out.println("AVERAGE OF 3 NUMBERS IS :"+avg);
        sc.close();
    }
}
