package java_questions.DAY2;
import java.util.*;
public class longestconsonatsubstring {
    public static String longconssub(String s) {
        if(s==null||s.isEmpty()){
            return " ";
        }
        String longsub="";
        String currstr="";
        String vowel="aeiouAIEOU";

        for(char i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(vowel.indexOf(c)==-1){
                currstr+=c;
            }
            else{
                if(currstr.length()>longsub.length()){
                    longsub=currstr;
                }
                currstr="";
            }
        }
        if(currstr.length()>longsub.length()){
            longsub=currstr;
        }
        return longsub;
    }
        
    public static void main(String[] args) {
        System.out.println("ENTER A STRING :");
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        System.out.println("LONGEST CONSONANT SUBSTRING IN "+str1+" IS :"+longconssub(str1));
        sc.close();
    }
}
