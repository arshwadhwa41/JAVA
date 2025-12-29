package java_questions.CodeChallange2;

import java.util.Arrays;

public class CountOfK {
    public static int count(int[] arr,int k){
        int last=lo(arr,k);
        int first=fo(arr,k);
        return last-first+1;
    }
    public static int fo(int arr[],int k){
        int st=0;
        int end=arr.length-1;
        int ans=-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]==k){
                ans=mid;
                end=mid-1;
            }
            else if(arr[mid]>k){
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return ans;
    }
    public static int lo(int arr[],int k){
        int st=0;
        int end=arr.length-1;
        int ans=-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]==k){
                ans=mid;
                st=mid+1;
            }
            else if(arr[mid]>k){
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,4,3,2,4,4};
        int k=4;
        Arrays.sort(arr);
        int res=count(arr,k);
        System.out.println("Number of time k repeated in O(log N) : "+ res);
    }
}
