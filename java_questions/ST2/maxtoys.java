package java_questions.ST2;

import java.util.Arrays;

public class maxtoys {
    public static int  cal(int cost[],int x,int n) {
        Arrays.sort(cost);
        int count=0;
        for(int i=0;i<n;i++){
            if(x>=cost[i]){
                x=x-cost[i];
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }
}
