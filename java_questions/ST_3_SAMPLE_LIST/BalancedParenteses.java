package java_questions.ST_3_SAMPLE_LIST;

import java.util.Scanner;

import Random_Practise.Stack;

public class BalancedParenteses {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String exp=sc.nextLine();

        Random_Practise.ArrayImplementationOfStack.Stack<Character> st=new Stack<>();
        boolean isbalanced=true;

        for(char ch:exp.toCharArray()){
            if(ch=='('||ch=='['||ch=='{'){
                st.push(ch);
            }
            else if(ch==')'||ch=='}'||ch==']'){
                if(st.isEmpty()){
                    isbalanced=false;
                    break;
                }
                char top=st.pop();
                if((ch==')' && top!='(')||(ch=='}' && top!='{')||(ch==']' && top!='[')){
                    isbalanced=false;
                    break;
                }
            }
        }
        if(!st.isEmpty()){
            isbalanced=false;
        }
        System.out.println(isbalanced ? "balanced" : "Not Balanced");
        sc.close();
    }
}
