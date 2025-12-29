package Testpad.Recursion;

import java.util.Scanner;

public class SecondMaxArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int large=Integer.MIN_VALUE;
        int secondlarge=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]>large){
                secondlarge=large;
                large=arr[i];
            }
            else if(arr[i]>second && arr[i]!=large){
                second=arr[i];
            }
        }
        if(second==Integer.MIN_VALUE){
            System.out.println(0);
        }
        else{
            System.out.println(second);
        }
    }
}
