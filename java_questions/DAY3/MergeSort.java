package java_questions.DAY3;

public class MergeSort {
    public static void conquer(int arr[],int s,int mid,int e) {
        int merged[]=new int[e-s+1];
        int idx1=s;
        int idx2=mid+1;
        int x=0;
        while(idx1<=mid && idx2<=e){
            if(arr[idx1]<arr[idx2]){
                merged[x++]=arr[idx1++];
            }
            else{
                merged[x++]=arr[idx2++];
            }
        }
        while(idx1<=mid){
            merged[x++]=arr[idx1++];
        }
        while(idx2<=e){
            merged[x++]=arr[idx2++];
        }
        for(int i=0,j=s;i<merged.length();i++,j++){
            arr[j]=merged[i];
        }
    }
    public static void divide(int arr[],int s,int e) {

        
        if(s>=e){return;}
        int mid=s+(e-s)/2;
        divide(arr,s,mid-1);
        divide(arr,mid+1,e);
        conquer(arr,s,mid,e);
    } 
    public static void main(String[] args) {
        int arr[]={2,1,4,1,3};
        int n=arr.length;
        divide(arr, 0, n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}


/* 









   public static void conquer(int arr[],int s,int mid,int e) {
        int merged[]=new int[e-s+1];
        int idx1=s;
        int idx2=mid+1;
        int x=0;
        while(idx1<=mid && idx2<=e ){
            if(arr[idx1]<=arr[idx2]){
                merged[x]=arr[idx1];
                x++;
                idx1++;
            }
            else{
                merged[x]=arr[idx2];
                x++;
                idx2++;
            }
            while (idx1<=mid) {
                merged[x]=arr[idx1];
                x++;
                idx1++;
            }
            while (idx2<=e) {
                merged[x]=arr[idx2];
                x++;
                idx2++;
            }
            for(int i=0,j=s;i<merged.length;i++,j++){
                arr[j]=merged[i];
            }
        }

    }
    public static void divide(int arr[],int s,int e) {
        if(s>=e){return;}
        int mid=s+(e-s)/2;
        divide(arr,0,mid-1);
        divide(arr,mid+1,e);
        conquer(arr,s,mid,e);

    }
        */