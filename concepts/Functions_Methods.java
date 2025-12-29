import java.util.*;

public class Functions_Methods {
    public static void main(String[] args) {
        System.out.println("enter your name:");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        printname(name);
        
        System.out.println(sum(4, 5));//9
        sc.close();
    }

    
    public static void printname(String args) {
        System.out.println(args);
        return;
    }


    public static int sum(int a,int b){
        return a+b;
    }
}
