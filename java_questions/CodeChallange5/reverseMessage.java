package java_questions.CodeChallange5;

public class reverseMessage {
    static String rev(String s){
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }
}
