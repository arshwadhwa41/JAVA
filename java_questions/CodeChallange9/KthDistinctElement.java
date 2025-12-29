package java_questions.CodeChallange9;

import java.util.HashMap;

public class KthDistinctElement {
    public static int KthDistinct(int arr[],int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        int count=0;
        for(int val:map.keySet()){
            if(map.get(val)==1){
                count++;
                if(count==k){
                    return val;
                }
            }
        }
        return 0;
    }
}
