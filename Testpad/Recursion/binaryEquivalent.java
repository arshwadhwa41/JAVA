package Testpad.Recursion;

import java.util.Scanner;

public class binaryEquivalent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int count=0;
        while (n>0) {
            int digit=n%10;
            int block=digit*Math.pow(2,count);
            sum+=block;
            digit/=10;
            count++;
        }
        System.out.println(sum);
        
    }
}
