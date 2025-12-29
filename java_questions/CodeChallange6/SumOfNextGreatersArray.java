package java_questions.CodeChallange6;

public class SumOfNextGreatersArray {
    static int collectdata(int arr[],int n){
        int sum=0;
        for(int i=0;i<n;i++){
            int data=-1;
            for(int j=i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    data=arr[j];
                    break;
                }
            }
            sum+=data;
        }
        return sum;
    }
}
