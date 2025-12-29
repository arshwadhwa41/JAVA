import java.util.Scanner;

public class palin_on_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int org=n;
        int rev=0;
        while(n!=0){
            int digit=n%10;
            rev=rev*10+digit;
            n/=10;
        }
        if(org==rev){
            System.out.println("palindrom");
        }
        else{
            System.out.println("no");
        }
    }
}
