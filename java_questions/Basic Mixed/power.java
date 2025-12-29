package java_questions;

import java.util.*;

public class power {
    public static void powercal() {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER BASE NUMBER:");
        int base=sc.nextInt();
        System.out.println("ENTER POWER NUMBER:");
        int power=sc.nextInt();

        System.out.println(base+"RAISED TO"+power+"IS :"+Math.pow(base,power));
        sc.close();   
    }
    public static void main(String[] args) {
        powercal();
    }
}
