package ST1;

import java.util.Scanner;

public class PrimeFactors {
    public static boolean prm(int n){
        if(n<2){
            return false;;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=2;i<=n;i++){
            if(prm(i) && n%i==0){
                System.out.println(i+" is a prime factor of "+n);
            }
        }

    }
}
