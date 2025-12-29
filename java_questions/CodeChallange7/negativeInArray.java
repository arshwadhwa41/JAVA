package java_questions.CodeChallange7;

public class negativeInArray {
    static void countNeg(int arr[],int T){
        int neg=0;
        for(int i=0;i<T;i++){
            if(arr[i]<0){
                neg++;
            }
        }
        System.out.println(neg);
    }    
}
