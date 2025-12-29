package java_questions.CodeChallange3;

import java.util.HashMap;

public class TotalSearchTime {
    static long SearchTime(int N,int Book_IDs[],int K,int booksToFind[]){
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<N;i++){
            map.put(book_IDs[i], i);
        }
        long total=0;
        for(int x:booksToFind){
            if(map:containsKey(x)){
                total+=map.get(x);
            }
            else{
                total+=N;
            }
        }
        return total;
    }
}
