import java.util.Scanner;

public class count_vow_cons {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine().toLowerCase();
        int vcount=0;
        int ccount=0;
        for(char i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z'){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    vcount++;
                }
                else{
                    ccount++;
                }
            }
            else{
                continue;
            }
        }
        System.out.println("number of vowels :"+vcount);
        System.out.println("number of consonats :"+ccount);
    }
}
