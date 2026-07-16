package module_2.multidimentional;

import java.util.*;

public class SetMatrixZeroes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        // Input matrix
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                arr[row][col] = sc.nextInt();
            }
        }

        // Arrays to mark rows and columns
        int[] zeroRows = new int[rows];
        int[] zeroCols = new int[cols];

        // Find zeros and mark their rows and columns
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {

                if (arr[row][col] == 0) {
                    zeroRows[row] = 1;
                    zeroCols[col] = 1;
                }
            }
        }

        //  Set marked rows and columns to zero
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {

                if (zeroRows[row] == 1 || zeroCols[col] == 1) {
                    arr[row][col] = 0;
                }
            }
        }

        // Print matrix
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}