package java_questions.CodeChallange2;

import java.util.Arrays;
import java.util.Scanner;

public class SecureKeyExchange {
    public static boolean exist(int []arr,int key){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(arr[m]===key) return true;
            if (arr[mid] > key) high = mid - 1;
            else low = mid + 1;
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();

            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }

            Arrays.sort(arr);
            int c=0;
            for(int i=0;i<n;i++){
                int tar=arr[i]+k;
                if(exist(arr,tar)){c++;}
            }
            System.out.println(c);
        }
    }
}
