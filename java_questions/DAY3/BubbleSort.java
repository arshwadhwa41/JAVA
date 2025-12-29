package java_questions.DAY3;

public class BubbleSort {
    public static void bsort(int arr[]) {
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={2,1,4,1,3};
        bsort(arr);
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}