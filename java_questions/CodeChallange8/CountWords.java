package java_questions.CodeChallange8;

public class CountWords {
    public static int count(String str){
        str=str.trim();
        if(str.length()==0){
            return 0;
        }
        String[] words=str.split("\\s+");
        return words.length; 
    }    
}
