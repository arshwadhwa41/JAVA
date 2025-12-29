package java_questions.CodeChallange9;

import java.util.HashMap;

public class FindTwoSpices {
    public static void FindSpices(int[] arr,int n){
        HashMap<Integer> map=new HashMap<>();
        for(int x:arr){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int small=Integer.MAX_VALUE;
        int secsmall=Integer.MAX_VALUE;

        for(int key : map.keySet()){
            if(map.get(key)%2!=0){
                if(key<small){
                    secsmall=small;
                    small=key;
                }
                else{
                    secsmall=key;
                }
            }
        }
        if(small<secsmall){
            System.out.print(small+" "+secsmall);
        }
        else{
            System.out.println();
        }
    }
}
