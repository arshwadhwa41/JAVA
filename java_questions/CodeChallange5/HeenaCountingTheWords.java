package java_questions.CodeChallange5;

public class HeenaCountingTheWords {
    static void CountFrequency(String exp){
        int [] freq=new int[256];
        for(int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);
            freq[ch]++;
        }
        for(int x : freq){
            if(freq[i]>0){
                System.out.print((char)i+''+freq[i]+" ");
            }
        }
    }    
}
