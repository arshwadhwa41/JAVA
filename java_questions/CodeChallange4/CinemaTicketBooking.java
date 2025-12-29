package java_questions.CodeChallange4;

import java.util.Scanner;

public class CinemaTicketBooking {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();
        int C = sc.nextInt();

        int[][] seat = new int[R][C];

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                seat[i][j] = sc.nextInt();
            }
        }
        int groupSize=sc.nextInt();
        boolean found=false;

        for(int i=0;i<R;i++){
            int count=0;
            int start=0;
            for(int j=0;j<C;j++){
                if(seat[i][j]==0){
                    count++;
                    if(count==1){
                        start=j;
                    }
                    if(count==k){
                        System.out.println("Available at Row "+(i+1)+", Starting Column "+(start+1));
                        found=true;
                        break;
                    }
                }
                else{
                    count=0;
                }
            }
            if(found){
                break;
            }
        }
        if(!found){
            System.out.println("Not Available.");
        }
    }    
}
