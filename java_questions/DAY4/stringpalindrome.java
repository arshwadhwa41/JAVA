package java_questions.DAY4;
import java.util.*; 
public class stringpalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String rev=new StringBuilder(a).reverse().toString();

        if(a.equalsIgnoreCase(rev)){System.out.println("PALINDROMIC STRING.");}
        else{System.out.println("NOT PALINDROMIC");}
        sc.close();
    }

    // public static boolean palin() {
    //     Scanner sc=new Scanner(System.in);
    //     String a=sc.nextLine();
    //     String rev="";
    //     for(int i=a.length()-1;i>=0;i--){
    //         rev+=a.charAt(i);
    //     }
    //     if(a.equals(rev)){
    //         System.out.println("palindrome");
    //     }
    //     else{System.out.println("no");}
    //     sc.close();
    // }
};