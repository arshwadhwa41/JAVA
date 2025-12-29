package FA3;

import java.util.Scanner;

public class health_Candies {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int arr[]=new int [t];
        for(int i=0;i<t;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<t;i++){
            int energy=0;
            int j=1;
            while(energy<arr[i]){
                energy+=j*j;
                j++;
            }
            System.out.println(energy);
        }
    }
}
