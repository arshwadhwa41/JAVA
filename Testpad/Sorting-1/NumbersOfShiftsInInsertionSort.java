import java.util.*;
package Testpad.Sorting-1;

public class NumbersOfShiftsInInsertionSort {
    public static long insertionSortShiftCounter(int[] arr, int n) {
        long shiftCount = 0;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // store original j (before shifting)
            int initialJ = j;

            // 1. Count shifts for moving arr[j] to arr[j+1]
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];  // shift right
                shiftCount++;         // count element shift
                j--;
            }

            // 2. Insert key at new position
            arr[j + 1] = key;

            // 3. Count key's own shift if its position changed
            if (j != initialJ) {
                shiftCount++;
            }
        }

        return shiftCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println(insertionSortShiftCounter(arr, n));
        }
    }    
}