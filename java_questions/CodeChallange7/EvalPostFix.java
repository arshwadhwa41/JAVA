package java_questions.CodeChallange7;

import Random_Practise.LinkedListImplementationOfStack.Node.Stack;

public class EvalPostFix {
    static int EPostF(Stack s,String exp){
        for(int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);
            if(Character.isDigit(ch)){
                s.push(ch-'0');
            }
            else{
                int a=s.pop();
                int b=s.pop();

                switch (ch) {
                    case '+':s.push(a+b);break;
                    case '-':s.push(b-a);break;
                    case '*':s.push(a*b);break;
                    case '/':s.push(b/a);break;
                    case '^':s.push((int)Math.pow(b, a));break;
                }
            }
        }
        return s.pop();
    }
}
