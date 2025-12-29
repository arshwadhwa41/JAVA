package java_questions.DAY1;

import java.util.Scanner;

public class bs_on_fm {
    public static int bs(int arr[],int n,int tar) {
        int s=0;
        int e=arr.length()-1;
        while(s<=e){
            int mid=s+(e-s)/2;

            if(arr[mid]==tar){
                return mid;
            }
            else if(arr[mid]<tar){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();

        int arr[]=new int[m*n];

        for(int i=0;i<m*n;i++){
                arr[i]=sc.nextInt();
            }
        }
        int tar=sc.nextInt();
        int sz=arr.length();
        int in=bs(arr,sz,tar);
        if(in==-1){
            System.out.println("not found");
        }
        else{
            System.out.println("found at"+in);
        }

    }
