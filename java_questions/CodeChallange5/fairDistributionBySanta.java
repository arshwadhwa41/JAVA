package java_questions.CodeChallange5;

public class fairDistributionBySanta {
    static long minCandies(int []candies,int K,int N){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<candies.length;i++){
            if(candies[i]<min){
                min=candies[i];
            }
        }
        long maxAllowed=(long)min+K;
        long removed=0;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>maxAllowed){
                removed+=candies[i]-maxAllowed;
            }
        }
        return removed;
    }
}
