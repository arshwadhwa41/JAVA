package java_questions.DAY4;
import java.util.*;

public class string_sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String mystr=sc.nextLine();

        char arr[]=mystr.toCharArray();
        Arrays.sort(arr);

        String res=new String(arr);

        System.out.println(res);
        sc.close();
    }

}
