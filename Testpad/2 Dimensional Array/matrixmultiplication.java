import java.util.*;
package Testpad.2 Dimensional Array;

public class matrixmultiplication {
    static void multiplyMatrix(int A[][], int B[][], int R1, int C1, int R2, int C2) {
        int[][] C = new int[R1][C2];

        for (int i = 0; i < R1; i++) {
            for (int j = 0; j < C2; j++) {
                C[i][j] = 0;
                for (int k = 0; k < C1; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        for (int i = 0; i < R1; i++) {
            for (int j = 0; j < C2; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read first matrix dimensions
        int R1 = sc.nextInt();
        int C1 = sc.nextInt();
        int[][] A = new int[R1][C1];

        // Read matrix A
        for (int i = 0; i < R1; i++) {
            for (int j = 0; j < C1; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // Read second matrix dimensions
        int R2 = sc.nextInt();
        int C2 = sc.nextInt();
        int[][] B = new int[R2][C2];

        // Read matrix B
        for (int i = 0; i < R2; i++) {
            for (int j = 0; j < C2; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // Multiply only if valid
        if (C1 != R2) {
            System.out.println("Invalid matrix dimensions");
        } else {
            multiplyMatrix(A, B, R1, C1, R2, C2);
        }
    }
}