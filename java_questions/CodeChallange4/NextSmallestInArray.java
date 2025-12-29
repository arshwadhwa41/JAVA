package java_questions.CodeChallange4;

public class NextSmallestInArray {
    public static void nextSmall(int arr[]){
        for(int i=0;i<arr.length;i++){
            int ele=-1;
            int curr=arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<curr){
                    ele+=arr[j];
                    break;
                }
            }
            if(i>0){System.out.print(" ");}
            System.out.println(ele);;
        }
    }
}
