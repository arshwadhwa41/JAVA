package java_questions.DAY1;

import java.util.Scanner;

public class col_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();

        int arr[][]=new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[m][n]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            int sum=0;
            for(int k=0;k<m;k++){
                sum+=arr[k][i]
            }
            System.out.println(sum);
        }
    }
}
