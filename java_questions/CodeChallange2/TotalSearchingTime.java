package java_questions.CodeChallange2;

import java.util.HashMap;

public class TotalSearchingTime {
    public static int searching(int[] books,int[] find){
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<book.length;i++){
            hs.put(books[i],i);
        }
        int res=0;
        for(int num:find){
            if(hs.containsKey(num)){
                res+=hs.get(num);
            }
            else{
                res+=books.length;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int books[]={4,3,2,1,8,5};
        int find[]={1,4,2};
        int result = searching(books, find);
        System.out.println("Total search time = " + result);
    }
}
