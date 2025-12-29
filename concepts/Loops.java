import java.util.*;
public class Loops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
 
        //for loop
        
        for(int i=0;i<100;i++){
            System.out.println("HELLO WORLD");//prints 100 times 
        }

        //WHILE LOOP
        
        int count=0;
        while (count<11) {
            System.out.println(count);
            count++;
        }

        //DO-WHILE LOOP

        int ind=0;
        do {
            System.out.println(ind);
            ind++;
        } while (ind<11);

        int i=12;
        do {
            System.out.println(i);
            i++;
            //13 print ho jayega
        } while (i<11);
        sc.close();
    }


    //SUM OF N NATURAL NUMBERS
    
    public static void SUMofN(int n) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of terms:");
        n=sc.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
            sum+=i;
        }
        System.out.println(sum);
        sc.close();
    }
}
