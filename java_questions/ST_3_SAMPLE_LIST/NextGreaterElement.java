package java_questions.ST_3_SAMPLE_LIST;

public class NextGreaterElement {
    public static void nextGreat(int arr[]){
        for(int i=0;i<arr.length;i++){
            int ele=-1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    ele=arr[j];
                    break;
                }
            }
            System.out.print(ele+" ");
        }
    }    
}
