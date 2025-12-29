package java_questions.CodeChallange5;

import java.util.HashMap;

public class TicketQueueProble {
    static int KthDistinct(arr[],int k,int n){
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],hm.get(getOrDefault(arr[i],0)+1));
        }
        for(int i=0;i<arr.length;i++){
            int c=0;
            if(hm.get(arr[i])==1){
                c++;
                if(c==k){
                    return arr[i];
                }
            }
        }
        return 0;
    }
}
