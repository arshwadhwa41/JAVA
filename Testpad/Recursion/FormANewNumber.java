package Testpad.Recursion;

import java.util.Scanner;

public class FormANewNumber {

    public static int evenDigits(int n){
        if(n==0){
            return 0;
        }
        int lastdigit=n%10;
        int rest=evenDigits(n/10);

        if(lastdigit%2==0){
            return rest*10+lastdigit;
        }
        else{
            return rest;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    }
    
}
