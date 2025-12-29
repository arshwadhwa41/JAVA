package java_questions.DAY1;

import java.util.Scanner;

public class armstrongnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        int tmp=num;
        int org=num;
        int digits=0;
        while(tmp!=0){
            tmp/=10;
            digits++;
        }
        num=org;
        int sum=0;
        while (num!=0) {
            int digit=num%10;
            sum+=Math.pow(digit, digits);
            num/=10;
        }
        if(sum==org){
            System.out.println("armstrong");
        }
        else{
            System.out.println("no");
        }
        sc.close();
    }
}
