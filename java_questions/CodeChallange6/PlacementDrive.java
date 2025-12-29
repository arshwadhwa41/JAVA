package java_questions.CodeChallange6;

import java.util.HashSet;

public class PlacementDrive {
    static int maxStudents(int CollegeIDs[],int n){
        HashSet <Integer> hs=new HashSet<>();
        for(int id : CollegeIDs){
            hs.add(id);
        }
        int longestchain=0;
        for(int id : hs){
            if(hs.contains(id-1)){
                int currID=id;
                int count=1;
                while(hs.contains(id+1)){
                    currID++;
                    count++;
                }
                longestchain=Math.max(count,longestchain);
            }
        }
        return longestchain;
    }
}
