package java_questions.CodeChallange7;

public class totalRewardPoints {
    public static int countPoints(int num){
        int sum=0;
        while(num>0){
            int d=num%10;
            if(d==2||d==4||d==6||d==9){
                sum+=1;
            }
            else if(d==8){
                sum+=2;
            }
            d/=10;
        }
        return sum;
    }
}
