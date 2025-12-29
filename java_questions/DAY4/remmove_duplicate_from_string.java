package java_questions.DAY4;
import java.util.*;
public class remmove_duplicate_from_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        Set <Character> set=new LinkedHashSet<>();
        for(char c:str.toCharArray()){
            set.add(c);
        }
        StringBuilder res=new StringBuilder();
        for(char c:set){
            res.append(c);
        }
        System.out.println("String without duplicates: "+res);
        sc.close();
    }
}
