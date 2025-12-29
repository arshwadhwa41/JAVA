package java_questions.DAY2;
import java.util.Arrays;
public class secondlargestinarray {
    public static int findSecondLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            System.out.println("Invalid input. Array must have at least two elements.");
            return -1; // Or throw an exception
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int currentElement = arr[i];
            
            // If the current element is greater than the largest,
            // update both largest and secondLargest.
            if (currentElement > largest) {
                secondLargest = largest;
                largest = currentElement;
            } 
            // If the current element is smaller than the largest
            // but greater than the secondLargest, update secondLargest.
            else if (currentElement > secondLargest && currentElement != largest) {
                secondLargest = currentElement;
            }
        }
        
        // Handle the case where all elements are the same.
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found (all elements might be the same).");
        }
        
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] numbers = {12, 35, 1, 10, 34, 1};
        int result = findSecondLargest(numbers);
        
        if (result != -1) {
            System.out.println("The original array is: " + Arrays.toString(numbers));
            System.out.println("The second largest element is: " + result);
        }
    }
}    


/*

    public static void so() {
        int arr[]={1,2,8,5,0,4};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]);
    }

 */