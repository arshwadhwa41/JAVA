package ST1;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int bin=sc.nextInt();
        int sum=0;
        int count=0;
        while(bin>0){
            int digit=bin%10;
            int block=digit*(Math.pow(2,count));
            sum+=block;
            bin/=10;
            count++;
        }
        System.out.println("decimal of is : "+sum);
    }
}
