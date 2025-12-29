package java_questions.CodeChallange8;

public class CapitalizeFirstChar {
    public static String Capitalize(String str){
        StringBuilder res=new StringBuilder();
        boolean Capitailze=true;

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==' '){
                res.append(ch);
                Capitailze=true;
            }
            else{
                if(Capitailze && ch>='a' && ch<='z'){
                    res.append((char)ch-32);
                    Capitailze=false;
                }
                else{
                    res.append(ch);
                    Capitailze=false;
                }
            }
        }
        return res.toString();
    }
}
