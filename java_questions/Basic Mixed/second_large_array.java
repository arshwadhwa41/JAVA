import java.util.Scanner;

public class second_large_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,35,4,5,3,22};

        int largest=Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondlargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>secondlargest && arr[i]<largest){
                secondlargest=arr[i];
            }
        }
        if(secondlargest==Integer.MIN_VALUE){
            System.out.println("Not found");
        }
        else{
            System.out.println(secondlargest);
        }
    }
}
