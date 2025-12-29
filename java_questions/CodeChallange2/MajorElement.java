package java_questions.CodeChallange2;

import java.util.*;

public class MajorElement {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,4,4,4,4,4,5,6};
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            int freq = map.getOrDefault(num,0)+1;
            hs.put(num,freq);
            if(map.get(num)>arr.length/2){
                System.out.println(num);
                return;
            }
        }
    }
}



/*
            if(!hs.containsKey(arr[i])) hs.put(arr[i],1);
            else{
                Integer freq = hs.get(arr[i]);
                freq++;
                hs.put(arr[i],freq);
            }
        }
        for(Integer num : hs.keySet()){
            if(hs.get(num)>arr.length/2){
                System.out.println(num);
                break;
            }
        }


*/