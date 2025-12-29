import java.util.*;
public class Conditions {
    public static void main(String[] args) {
        adult(19);//adult
        oddeve(19);//ODD
        comp(13, 21);//b greater
        greetings(2);//Namaste
        monthcheck(2);//feb
    }

    // IF-ELSE CASES:
    public static void adult(int age) {
        if(age<18){
            System.out.println("not adult");
        }
        else{
            System.out.println("adult");
        }
    }
    public static void oddeve(int num) {
        if(num%2!=0){
            System.out.println("ODD");
        }
        else{
            System.out.println("EVEN");
        }
    }
    public static void comp(int a,int b) {
        if(a<b){
            System.out.println("b greater");
        }
        if(a>b){
            System.out.println("a greater");
        }
        else{
            System.out.println("EQUAL");
        }
    }


    // IF ELSE-IF CASES:
    public static void adult2(int age) {
        if(age < 18) {
            System.out.println("not adult");
        }
        else if(age >= 18) {
            System.out.println("adult");
        }
    }

    public static void oddeve2(int num) {
        if(num % 2 != 0) {
            System.out.println("ODD");
        }
        else if(num % 2 == 0) {
            System.out.println("EVEN");
        }
    }

    public static void comp2(int a, int b) {
        if(a < b) {
            System.out.println("b greater");
        }
        else if(a > b) {
            System.out.println("a greater");
        }
        else {
            System.out.println("EQUAL");
        }
    }
    public static void greetings(int num) {
        if(num==1) {
            System.out.println("hello");
        }
        else if(num==2) {
            System.out.println("Namaste");
        }
        else if(num==3){
            System.out.println("BONJOUR");
        }
    }

    //SWITCH-CASE STATEMENTS:

    public static void monthcheck(int month) {
      switch (month) {
        case 1:
            System.out.println("jan");
            break;
        case 2:
            System.out.println("feb");
            break;
        case 3:
            System.out.println("march");
            break;
        case 4:
            System.out.println("april");
            break;
        case 5:
            System.out.println("may");
            break;
        case 6:
            System.out.println("june");
            break;
        case 7:
            System.out.println("july");
            break;
        case 8:
            System.out.println("august");
            break;
        case 9:
            System.out.println("sept");
            break;
        case 10:
            System.out.println("oct");
            break;
        case 11:
            System.out.println("nov");
            break;
        case 12:
            System.out.println("dec");
            break;

        default:
            System.out.println("invalid");
            break;
      }
    }
}