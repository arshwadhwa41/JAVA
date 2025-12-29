import java.util.*;
public class Pattern_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*  SOLID ROHOMBUS:
            ****
           ****
          ****
         ****
        ****       */

        System.out.println("enter number of rows:");
        int sr=sc.nextInt();
        for(int i=1;i<=sr;i++){
            //spaces
            for(int j=1;j<=sr-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();

        /*NUMBER PYRAMID:
             1
            2 2
           3 3 3
          4 4 4 4
         5 5 5 5 5
        */

        System.out.println("enter number of rows:");
        int np=sc.nextInt();
        for(int i=1;i<=np;i++){
            //spaces
            for(int j=1;j<=sr-i;j++){
                System.out.print(" ");
            }
            //numbers
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        sc.close();

    /*PALINDROMIC NUMBER PYRAMID:
                 1
               2 1 2
             3 2 1 2 3
           4 3 2 1 2 3 4
         5 4 3 2 1 2 3 4 5   */

        System.out.println("enter number of rows:");
        int pnp=sc.nextInt();

        for(int i=1;i<=pnp;i++){
            //SPACES
            for(int j=1;j<=pnp-i;j++){
                System.out.print(" ");
            }
            //FRONT HALF NUMBERS
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            //FRONT HALF NUMBERS
            for(int j=2;j<=i;j++){
                System.out.print(" "+j);
            }
            System.out.println();
        }
        sc.close();
    /*DIAMOND:

                 *
               * * *
             * * * * *
           * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
           * * * * * * *
             * * * * *
               * * *
                 *                       */

        System.out.println("enter number of rows:");
        int d=sc.nextInt();

        //UPPER HALF
        for(int i=1;i<=d;i++){
            //SPACES
            for(int j=1;j<=d-i;j++){
                System.out.print(" ");
            }
            //FRONT HALF NUMBERS
            for(int j=i;j<=(2*i-1);j++){
                System.out.print("*"+" ");
            }

            System.out.println();
        }
        //LOWER HALF
        for(int i=d;i>=1;i--){
            //SPACES
            for(int j=1;j<=d-i;j++){
                System.out.print(" ");
            }
            //FRONT HALF NUMBERS
            for(int j=i;j<=(2*i-1);j++){
                System.out.print("*"+" ");
            }

            System.out.println();
        }
        sc.close();
    }
}
