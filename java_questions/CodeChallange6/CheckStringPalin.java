package java_questions.CodeChallange6;

public class CheckStringPalin {
    static boolean palin(String exp){
        int st=0;
        int end=exp.length()-1;
        while(st<end){
            if(str.charAt(st)!=str.charAt(end)){
                return false;
            }
            st++;
            end--;
        }
        return true;
    }
}
