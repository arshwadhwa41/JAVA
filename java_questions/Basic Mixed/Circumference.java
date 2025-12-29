package java_questions;

import java.util.Scanner;

public class Circumference {
    public static void circumference() {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER RADIUS NUMBER:");
        int n=sc.nextInt();

        System.out.println("CIRCUMFERENCE OF CIRCLE IS :"+(2*3.14*n));
        sc.close();   
    }
    public static void main(String[] args) {
        circumference();
    }
}
