package Testpad.Array and Linear Search;


import java.util.Scanner;


public class MaximumFrequencyInSequence {
    public static int max(int arr[],int n){
        int[] freq=new int[1001];
        for(int i=0;i<=1000;i++){
            freq[arr[i]]++;
        }
        int maxfreq=0;
        int ans=0;
        for(int i=0;i<n;i++){
            if(freq[i]>maxfreq){
                maxfreq=freq[i];
                ans=i;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int j=0;j<n;j++){
                arr[j]=sc.nextInt();
            }
            int x=max(arr, n);
            System.out.print(x);
        }
    }
}
