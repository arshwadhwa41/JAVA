import java.util.Scanner;

public class largest_in_arr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,6,3,7,3};
        int max=arr[0];
        for(int i=0;i<arr.length();i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("largest:"+max);
    }
}
