package java_questions.CodeChallange4;

import java.util.Scanner;

public class HeatWave {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        new int [][]tmp=new int[7][4];
        for(int i=0;i<7;i++){
            for(int j=0;j<4;j++){
                tmp[i][j]=sc.nextInt();
            }
        }
        String []days={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        double maxavg=1;
        int hotindex=0;
        for(int i=0;i<7;i++){
            int sum=0;
            for(int j=0;j<4;j++){
                sum=tmp[i][j];
            }
            double avg=sum/4.0;
            if(avg>maxavg){
                maxavg=avg;
                hotindex=i;
            }
        }
        System.out.println("HOTEST DAY : "+days[hotindex]);
    }
}
