package java_questions.CodeChallange7;

public class EvenOddInArray {
    static void countEO(int arr[],int T){
        int odd=0;
        int even=0;
        for(int i=0;i<T;i++){
            if(arr[i]%2==1){
                odd++;
            }
            else{
                even++;
            }
        }
        System.out.println(even+" "+odd);
    }    
}
