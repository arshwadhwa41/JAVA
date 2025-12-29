package java_questions.DAY2;
import java.util.Arrays;
import java.util.Scanner;

public class validanagram {
    public static boolean ana(String a,String b) {
        if(a.length()!=b.length()){
            return false;
        }
        char arr1[]=a.toCharArray();
        char arr2[]=b.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);   
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("string 1:");
        String a=sc.nextLine();
        System.out.println("string 2:");
        String b=sc.nextLine();        

        if(ana(a,b)){
            System.out.println("anagram");
        }
        else{
            System.out.println("not anagram");
        }
        sc.close();
    }

}
