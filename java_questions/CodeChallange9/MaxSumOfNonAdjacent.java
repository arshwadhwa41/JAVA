package java_questions.CodeChallange9;

public class MaxSumOfNonAdjacent {
    public static long sum(long arr[]){
        long prev1=0;
        long prev2=0;
        for(long x:arr){
            long curr=Math.max(prev1,prev2+x);
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
}
