package java_questions.CodeChallange6;

public class secmaxinarray {
    public static int secmax(int arr[],int n){
        int max=0;
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        int sec=0;
        for(int i=0;i<n;i++){
            if(sec<arr[i] && arr[i]<max){
                sec=arr[i];
            }
        }
        return sec;
    }
}
