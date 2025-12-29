import java.util.*;
public class Patterns {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //SOLID RECTANGLE
        System.out.println("enter length:");
        float l=sc.nextFloat();
        
        System.out.println("enter breadth(greater than l):");
        float b=sc.nextFloat();

        for(int i=0;i<l;i++){
            for(int j=0;j<b;j++){
                System.out.println("*");
            }
            System.out.println();
        }
        //HOLLOW RECTANGLE        
        System.out.println("enter length:");
        float hl = sc.nextFloat();
        
        System.out.println("enter breadth(greater than l):");
        float hb = sc.nextFloat();

        for (int i = 0; i < hl; i++) {
            for (int j = 0; j < hb; j++) {
                if (j == 0 || j == (int)hb - 1) {
                    System.out.print("*");
                } else {
                    if (i == 0 || i == (int)hl - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
        sc.close();


        //lhalf PYRAMID
        
        System.out.println("enter rows of pyramid:");
        int lhpr = sc.nextInt();

        for (int i = 0; i < lhpr; i++) {
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();

        //Inverted half PYRAMID
        
        System.out.println("enter rows of pyramid:");
        int ihpr = sc.nextInt();

        for (int i = 1; i <= ihpr; i++) {
            for(int j=1;j<=(ihpr-i)+1;j++){
                System.out.print("*");
            }

            System.out.println();
            //ihpr=ihpr-1;
        }
        sc.close();

        /*Rhalf PYRAMID
        
           *
         ***
        ****  

        */
        System.out.println("enter rows of pyramid:");
        int rhpr = sc.nextInt();

        for (int i = 1;i<rhpr;i++) {
            for(int j=1;j<=rhpr-i;j++){
                System.out.print(" ");
            }
        
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
            sc.close();
        }

        /*HALF PYRAMID WITH NUMBER
        1
        1 2
        1 2 3
        1 2 3 4
         */
        System.out.println("enter rows of pyramid:");
        int hpwm = sc.nextInt();

        for (int i = 1;i<hpwm;i++) {
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
            sc.close();
        }
        /*INVERTED HALF PYRAMID WITH NUMBER
        1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2
        1
         */
        System.out.println("enter rows of pyramid:");
        int ihpwm = sc.nextInt();

        for (int i = 1;i<=ihpwm;i++) {
            for(int j=1;j<=(ihpwm-i)+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
            sc.close();
        }
        /*FLOYDS TRIANGLE
        1
        2 3
        4 5 6
        7 8 9 10
         */
        System.out.println("enter rows of pyramid:");
        int ft = sc.nextInt();

        for (int i = 1;i<=ft;i++) {
            int ex=1;
            for(int j=1;j<=i;j++){
                System.out.print(ex+" ");
                ex++;
            }
            System.out.println();
            sc.close();
        }
        /* 0 & 1 TRIANGLE
        1
        0 1
        1 0 1
        0 1 0 1
        */
        System.out.println("enter rows of pyramid:");
        int zot = sc.nextInt();

        for (int i = 1;i<=zot;i++) {
            for(int j=1;j<=i;j++){
                int sum=i+j;
                if(sum%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
            sc.close();
        }

        /*
        BUTTERFLY PATTERN:

        *             *
        * *         * *
        * * *     * * *
        * * * * * * * *
        * * * * * * * *
        * * *     * * *
        * *         * *
        *             *
        
        */
        System.out.println("Enter rows for the butterfly pattern:");
        int bp = sc.nextInt();

        // UPPER HALF
        for (int i = 1; i <= bp; i++) {
            // Stars on the left side
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Spaces in the middle
            int spaces = 2 * (bp - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  "); // Print two spaces for each gap
            }

            // Stars on the right side
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line
        }

        // LOWER HALF
        for (int i = bp; i >= 1; i--) {
            // Stars on the left side
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Spaces in the middle
            int spaces = 2 * (bp - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  "); // Print two spaces for each gap
            }

            // Stars on the right side
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line
        }
        sc.close();
    }


};