package java_questions;
import java.util.*;
public class Vote_Eligible {

    public static void ELIGIBLE() {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER AGE :");
        int n=sc.nextInt();

        if(n<18){System.out.println("NOT ELIGIBLE TO VOTE.");}
        if(n>=18){System.out.println("ELIGIBLE TO VOTE.");}
        sc.close();   
    }
    public static void main(String[] args) {
        ELIGIBLE();
    }
}