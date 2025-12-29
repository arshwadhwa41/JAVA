package Testpad.Recursion;

import java.util.Scanner;

public class GCD {
    public static int gcd(int a,int b){
        if(b==0){return a;}
        else{gcd(b,a%b);}
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st number:");
        int a=sc.nextInt();
        System.out.println("enter 2nd number:");
        int b=sc.nextInt();
        gcd(a,b);
    }
}
