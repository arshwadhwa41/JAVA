package Testpad.Binary

import java.util.Scanner;

Search;

public class RotationcountofasortedArray {
    public static int rotation(int[] arr, int n) {

        boolean sorted = true;
        
        for(int i = 1; i < n; i++){
            if(arr[i] < arr[i - 1]){
                sorted = false;
                break;
            }
        }

        if(sorted){
            return -1;
        }

        int minval = arr[0];
        int minind = 0;

        for(int i = 1; i < n; i++){
            if(arr[i] < minval){
                minval = arr[i];
                minind = i;
            }
        }
        return minind;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0; i < t; i++){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int j = 0; j < n; j++){
                arr[j] = sc.nextInt();
            }

            int x = rotation(arr, n);
            System.out.println(x);
        }
    }   
}
