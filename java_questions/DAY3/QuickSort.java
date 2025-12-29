package java_questions.DAY3;
public class QuickSort {
    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partition(int arr[],int st,int end){
        int idx=st-1,pivot=arr[end];
        for(int j=st;j<end;j++){
            if(arr[j]<=pivot){
                idx++;
                swap(arr,j,idx);
            }
        }
        idx++;
        swap(arr,end,idx);
        return idx;

    }
    public static void qsort(int arr[],int st,int end){
        if(st<end){
            int pvtidx=partition(arr,st,end);
            qsort(arr, st, pvtidx-1);
            qsort(arr, pvtidx+1,end);
        }
    }
    public static void main(String[] args) {
        int arr[]={2,1,4,1,3};
        qsort(arr,0,arr.length-1);
        for(int val:arr){
            System.out.println(val+" ");
        }
    }
}
