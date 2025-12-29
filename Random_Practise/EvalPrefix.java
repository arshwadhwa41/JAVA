package Random_Practise;

import Random_Practise.LinkedListImplementationOfStack.Node.Stack;

public class EvalPrefix {
    public static int EvalPre(Stack st,String exp){
        for(int i=exp.length()-1;i>=0;i--){
            char ch=exp.charAt(i);
            if(ch==' '){
                continue;
            }
            if(Character.isDigit(i)){
                st.push(ch-'0');
            }
            else{
                int a=st.pop();
                int b=st.pop();
                int res=0;
                Switch(ch){
                    Case 'a+b':res=a+b;break;
                    Case 'a-b':res=a-b;break;
                    Case 'a*b':res=a*b;break;
                    Case 'a/b':res=a/b;break;
                    Case 'a^b':res=(int)Math.pow(a,b);break;
                }
                st.push(res);
            }
        }
        return st.pop();
    }    
}
