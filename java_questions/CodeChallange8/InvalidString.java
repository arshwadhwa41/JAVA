package java_questions.CodeChallange8;

public class InvalidString {
    public static void valid(String str){
        if(str.length()==0){
            System.out.println("Invalid");
            return;
        }

        char first=str.charAt(0);
        if(!Character.isLetter(first)){
            System.out.println("Invalid");
            return;
        }

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(!Character.isLetterOrDigit(ch)){
                System.out.println("Invalid");
                return;
            }
        }
        System.out.println("valid");
    }
}
