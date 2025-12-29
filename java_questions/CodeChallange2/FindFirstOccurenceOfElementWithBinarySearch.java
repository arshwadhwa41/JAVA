package java_questions.CodeChallange2;

public class FindFirstOccurenceOfElementWithBinarySearch {
    public int firstoccur(int [] arr, int tar){
        int st=0;
        int end=arr.length-1;
        int ans=-1;
        while(st<end){
            int mid=st+(end-st)/2;
            if(arr[mid]==tar){
                ans=mid;
                end=mid-1;//for checking earlier occurence
            }
            else if(arr[mid]>tar){
                st=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,3,4,5,6,4,4,7};
        int tar=4;
        System.out.println("first occurence : "+ firstoccur(arr,tar));
    }
}
