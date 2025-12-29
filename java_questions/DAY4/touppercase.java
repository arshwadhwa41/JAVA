package java_questions.DAY4;

public class touppercase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String res="";

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a'  && ch<='z'){
                res+=(char)(ch-32);
            }
            else{
                res+=ch
            }
        }

        System.out.println(res);
        sc.close();
    }
}
    
