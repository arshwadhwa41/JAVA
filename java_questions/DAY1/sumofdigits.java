package java_questions.DAY1;

import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int a=sc.nextInt();
        int sum=0;
        while(a!=0){
            int digit=a%10;
            sum+=digit;
            a/=10;
        }
        System.out.println(sum);
        sc.close();
    }
}
