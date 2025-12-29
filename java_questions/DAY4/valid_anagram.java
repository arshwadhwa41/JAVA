package java_questions.DAY4;

import java.util.Arrays;
import java.util.Scanner;

public class valid_anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String a=sc.nextLine();
        String b=sc.nextLine();

        char[]arr1=a.toCharArray();
        char[]arr2=b.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2)){
            System.out.println("Anagram");
        }
        else{
            System.out.println("not anagram.");
        }
        sc.close();
    }
}
