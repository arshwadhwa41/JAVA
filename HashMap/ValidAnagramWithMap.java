import java.util.*;
package HashMap;

public class validAnagramWithMap {
    public boolean isAnagram(String a,String b){
        if(a.length()!=b.length()){
            return false;
        }
        HashMap<Character,Integer> m1=new HashMap<>();
        HashMap<Character,Integer> m2=new HashMap<>();

     for(int i=0;i<a.length();i++){
        Character ch=a.charAt(i);
        m1.put(ch,m1.getOrDefault(ch,0)+1);
     }
    
     for(int i=0;i<b.length();i++){
        Character ch=b.charAt(i);
        m2.put(ch,m2.getOrDefault(ch,0)+1);
     }
     if(m1.equals(m2)){
        return true;
     }
     else{
        return false;
     }
    }
}