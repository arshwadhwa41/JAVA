package java_questions.DAY4;
import java.util.*;
public class count_vow_cons {
    public static void main(String[] args) {
        Scanner sc=new Scanner((System.in));
        String a=sc.nextLine().toLowerCase();

        int v=0,c=0;

        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
            if("aieou".indexOf(ch)!=-1){v++;}
            else if(ch>='a' && ch<='z'){c++;}
        }
        System.out.println("Vowels are"+v);
        System.out.println("consonants are"+c);
        sc.close();
    }
}
