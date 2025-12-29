package java_questions.ST_3_SAMPLE_LIST;

import java.util.Scanner;

public class SumOfMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] arr=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                sum+=arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
