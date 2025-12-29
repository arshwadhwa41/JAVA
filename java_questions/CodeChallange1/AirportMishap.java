package java_questions.CodeChallange1;

import java.util.Arrays;
import java.util.Scanner;

public class AirportMishap {
    public static int arrDiff(int marr[],int narr[]) {
        Arrays.sort(marr);
        Arrays.sort(narr);
        for(int i=0;i<narr.length;i++){
                if(marr[i]!=narr[i]){
                    return marr[i];
                }
        }
        return marr[marr.length-1];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++){
            int m=sc.nextInt();
            int n=sc.nextInt();
            int[] marr=new int[m];
            int[] narr=new int[n];

            for(int j=0;j<m;j++){
                marr[i]=sc.nextInt();
            }
            for(int j=0;j<n;j++){
                narr[i]=sc.nextInt();
            }
            int res=arrDiff(marr,narr);
            System.out.println(res);
        }
    }
}
