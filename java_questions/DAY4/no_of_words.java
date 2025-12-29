package java_questions.DAY4;

public class no_of_words {
import java.util.Scanner;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line=sc.nextLine().trim();

        if(line.isEmpty()){
            System.out.println("0");
        }
        else{
            String word[]=line.split("\\s+");
            System.out.println(word.length);
        }
        sc.close();
    }
}
