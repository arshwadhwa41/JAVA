package java_questions.CodeChallange1;

import java.util.HashSet;
import java.util.Set;

public class deleteRepeatedStringInArrray {

    public static String RepeatedElement(String[] arr){
        Set<String> seen=new HashSet<>();

        for(int i=0;i<arr.length;i++){
            String item=arr[i];
            if(seen.contains(item)){
                return item;
            }
            seen.add(item);
        }
        return null;
    }
    public static void main(String[] args) {
        String[] data = {"a123", "ft7687", "a123", "23szjs"};
        String repeating=RepeatedElement(data);

        if(repeating!=null){
            System.out.println(repeating);
        }
        else{
            System.out.println("no repeating element found.");
        }
    }    
}
