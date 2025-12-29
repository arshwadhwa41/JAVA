package java_questions.CodeChallange7;

import java.util.List;

public class BuyTicketAtCounter {
    public static long howMuchToWait(List<Integer> tickets,int p){
        long time=0;
        int target=tickets.get(p);

        for(int i=0;i<tickets.size();i++){
            if(i<=p){
                time+=Math.min(target,tickets.get(i));
            }
            else{
                time+=Math.min(target-1,tickets.get(i));
            }
        }
        return time;
    }
}