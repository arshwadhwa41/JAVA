package java_questions.ST3;

public class StringPalin {
    static boolean palin(String str){
        int st=0;
        int end=str.length()-1;
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
