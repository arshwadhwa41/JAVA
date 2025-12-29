package java_questions;
import java.util.*;
public class Factorial {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        System.out.println(fact(num));//
        sc.close();
    }
    public static int fact(int num) {
        if (num<0) {
            return -1;
        }
        if(num==0 || num==1){
            return 1;
        }
        else{
            return num*fact(num-1);
        }
    }
}