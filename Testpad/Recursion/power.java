package Testpad.Recursion;

public class power {
class Result {
    static long power(int base, int exp) {
      // Write your code here
        if(exp<0){return -1;}
        if(exp==0){return 1;}
        long res=1;
        for(int i=1;i<=exp;i++){
            res=res*base;
        }
        return res;
     }
    }
}
