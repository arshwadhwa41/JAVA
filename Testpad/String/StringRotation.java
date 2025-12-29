package Testpad.String;

import java.util.*;

public class StringRotation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();

        String str3=b+b;
        if(str3.contains(a)){
            System.out.println("String Rotation is true.");
        }
        else{
            System.out.println("String Rotation is false.");
        }
    }
}
