package java_questions.DAY1;

import java.util.Scanner;

public class oddeve {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int a=sc.nextInt();
        if(a%2!=0){System.out.println("number is odd.");}
        else{System.out.println("number is even.");}
        sc.close();
    }
}
