package java_questions.ST2;

public class array_arrange {
    public static int[] reorder(int arr[]) {
        int n=arr.length;
        int []newarr=int new[n];
        int index=0;
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                newarr[index]=arr[i];
                index++;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                newarr[index]=arr[i];
                index++;
            }
        }
        return newarr;
    }
    public static void main(String[] args) {
        int arr[]={1,3,-4,7,-8,5,-6,9};
        reorder(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}
