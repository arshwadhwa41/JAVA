package java_questions.CodeChallange2;

public class LAstOccurenceQuery {
    static long solveChallanges(int N,int arr[],int K,int challenges[]){
        long sum=0;

        for(int x:challenges){
            int index=lastOccur(arr,x);
            sum+=index;
        }
        return sum; 
    }

    public int lastOccur(int[] arr,int x){
        int s=0;
        int end=arr.length-1;
        int ans=-1;
        while(st<end){
            int mid=s+(end-s)/2;

            if(arr[mid]==x){
                ans=mid;
                st=mid+1;
            }
            else if(arr[mid]>x){
                s=mid+1;
            }
            else if(arr[mid]<x){
                end=mid-1;
            }
            else{
                return -1;
            }
        }
    }
}
