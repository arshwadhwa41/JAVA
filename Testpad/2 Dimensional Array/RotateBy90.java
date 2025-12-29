import java.util.*;

package Testpad.2 Dimensional Array;

public class RotateBy90 {
    public static void rotate90(int[][] arr, int n) {

        for (int col = 0; col < n; col++) {
            for (int row = n - 1; row >= 0; row--) {
                System.out.print(arr[row][col]);
                if (row != 0) System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] arr = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            rotate90(arr, n);
            System.out.println();   // blank line between testcases
        }
    }    
}