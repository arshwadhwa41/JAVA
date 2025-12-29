public class EvalPostfix {
    public static EvalPost(Stack st,String exp){
        for(int i=0;i<exp.length();i++){
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
                switch (ch) {
                    case 'a+b':res=a+b;break;
                    case 'a-b':res=a-b;break;
                    case 'a*b':res=a*b;break;
                    case 'a/b':res=a/b;break;
                    case 'a^b':res=(int)Math.pow(a, b);break;
                }
                s.push(res);
            }
            return s.pop();
        }
    }
}