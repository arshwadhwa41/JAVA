import java.util.*;
package HashMap;

public class Hashing {
    public static void main(String[] args) {
        //COUNTRY(KEY) : POPULATION(VALUE)
        HashMap<String,Integer> map=new HashMap<>();

        //INSERTION
        map.put("India",120);
        map.put("US",30);
        map.put("China",150);
        System.out.println(map);//{China=150, US=30, India=120} : UNORDERED PAIRS

        //UPDATING OLD VALUE;
        map.put("China",180);
        System.out.println(map);//{China=180, US=30, India=120} : UNORDERED PAIRS

        //SERACH OPERATIONS:

        //containsKey() : USED TO CHECK WHETHER THE PARTICULAR KEY EXIST OR NOT IN THE MAP AND RESULT IS BOOLEAN.
        if(map.containsKey("China")){
            System.out.println("China as KEY is present in the MAP.");//PRINTED
        }
        else{
            System.out.println("China as KEY is NOT present in the MAP.");
        }

        //get() : USED TO THE GET THE VALUE OF PARTICULAR KEY.
        System.out.println(map.get("India"));//120
        System.out.println(map.get("Bhutan"));//null : because key not exist in MAP
        
        //WAY OF APPLYIN FOR LOOP
        int arr[]={1,2,3};
        for(int val:arr){
            System.out.print(val+" ");
        }
        
        //ITERATION ON HASHMAP:

        //SYNTAX OF APPLYING LOOP FOR ITERATION IN HASHMAP
        for(Map.Entry <String,Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
            /*
            China
            180
            US
            30
            India
            120
            */
        }
        

        //keySet() : BASICALLY IT USED TO KEEP THE SET OF ALL THE KEYS IN THE MAP
        Set<String> keys=map.keySet();
        for(String key : keys){
            System.out.println(key+" "+map.get(key));
            /*
            China 180
            US 30
            India 120
            */
        }

        //remove() : USED TO REMOVE A PAIR(KEY & VALUE) OUT OF THE MAP.
        map.remove("China");
        System.out.println(map);//{US=30, India=120} : CHINA IS REMOVED
    }
}
