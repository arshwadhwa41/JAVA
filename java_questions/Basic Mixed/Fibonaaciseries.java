package java_questions;
import java.util.*;
public class Fibonaaciseries {
    public static int fib(int num) {
        if (num<=1){
            return num;
        }
        return fib(num-1)+fib(num-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER Nth NUMBER:");
        int a=sc.nextInt();
        System.out.println("FIBONAACI SERIES :"+a);
        for(int i=0;i<a;i++){
            System.out.print(fib(i)+" ");
        }
        sc.close();
    }
}