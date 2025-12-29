package java_questions.ST_3_SAMPLE_LIST;

import java.util.Arrays;
import java.util.Scanner;

public class MAXMINofARRAY {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr=new int arr[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int len=arr.length;
        System.out.println("MAX : "+arr[len-1]);
        System.out.println("MIN : "+arr[l0]);
    }
}
