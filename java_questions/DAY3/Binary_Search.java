package java_questions.DAY3;

import java.util.Scanner;

public class Binary_Search {
    public static int bs(int arr[],int target,int size) {
        int s=0;
        int e=size-1;
        while(s<=e){
            int mid=s+(e-s)/2;

            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]>target){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int res=bs(arr,target,n);
        if(res==-1){
            System.out.println("not found");
        }
        else{
            System.out.println("your target found at index "+res);
        }
        sc.close();
    }
}
