package java_questions.CodeChallange5;

public class CaesarCipher {
    public staic String encrypt(String txt,int shift){
        StringBuilder sb=new StringBuilder();
        for(char ch:txt.toCharArray()){
            if(ch>='A' && ch<='Z'){
                char c=(char)((ch-'A'+shift)%26+'A');
                sb.append(c);
            }else if(ch>='a' && ch<='z'){
                char c=(char)((ch-'a'+shift)%26+'a');
                sb.append(c);
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static String decrypt(String txt,int shift){
        return encrypt(txt,26-(shift%26));
    }
    
    public static void main(String[] args) {
        String msg = "Hello World";
        int shift = 3;

        String encrypted = encrypt(msg, shift);
        System.out.println("Encrypted: " + encrypted);

        String decrypted = decrypt(encrypted, shift);
        System.out.println("Decrypted: " + decrypted);
    }
}
