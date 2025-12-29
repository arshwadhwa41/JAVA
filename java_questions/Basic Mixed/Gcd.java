package java_questions;

import java.util.*;
public class Gcd {
    public static void gcdcal() {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER 1st NUMBER:");
        int a=sc.nextInt();
        System.out.println("ENTER 2nd NUMBER:");
        int b=sc.nextInt();
        a=Math.abs(a);
        b=Math.abs(b);

        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        System.out.println("GCD OF TWO NUMBERS IS :"+a);
        sc.close();
    }
    public static void main(String[] args) {
        gcdcal();
    }
}