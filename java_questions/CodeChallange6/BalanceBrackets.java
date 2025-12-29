package java_questions.CodeChallange6;

public class BalanceBrackets {
    static int brackets(String str){
        int n=str.length();
        if(n%2!=0){
            return 1;
        }
        int open=0;
        int close=0;
        for(char ch : str.toCharArray()){
            if(ch=='{'){
                open++;
            }
            else if(ch=='}'){
                if(open>0){
                    open--;
                }
                else{
                    close++;
                }
            }
        }
        return (open+1)/2+(close+1)/2;
    }
}
