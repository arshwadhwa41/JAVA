package java_questions.CodeChallange2;

import java.util.Arrays;
import java.util.Scanner;

public class arrayMax {
    public static normalmax(int[] arr,int t){
        int max=arr[0];
        for(int i=0;i<t;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public static maxbysort(int[] arr,int t){
        Arrays.sort(arr);
        return arr[t-1];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        int[] arr=new int[t];
        for(int i=0;i<t;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("max by sort :"+ maxbysort(arr,t));
        System.out.println("normal max :"+ normalmax(arr,t));
    }
}
