package Testpad.Sorting-1;
import java.util.*;
public class NumberOfSwapsInBubbleSort {
    public static int bubblesortswaps(int arr[],int n){
        int count=0;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                    count++;
                }
            }
        }
        return count;
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

            int x = bubblesortswaps(arr, n);
            System.out.println(x);
        }
    }       
}
