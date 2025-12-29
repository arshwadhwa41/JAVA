package Testpad.Recursion;

import java.util.Scanner;

public class sumofdigits {
    public static 
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        while (n>0) {
            int digit=n%10;
            sum+=digit;
            digit/=10;
        }
        System.out.println(sum);
    }    
}
