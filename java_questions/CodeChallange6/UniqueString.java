package java_questions.CodeChallange6;

public class UniqueString {
    static boolean Unique(String exp){
        for(int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);
            for(int j=i+1;j<exp.length();j++){
                char curr=exp.charAt(j);
                if(ch==curr){
                    return false;
                }
            }
        }
        return true;
    }
}
