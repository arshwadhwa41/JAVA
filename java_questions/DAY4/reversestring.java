package java_questions.DAY4;
import java.util.*; 
public class reversestring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String rev=="";

        for(char i= a.length()-1;i>=0;i--){
            rev+=a.charAt(i);
        }
        System.out.println(rev);
    }
}
