package module_2.multidimentional;

import java.util.*;

public class rotate_90_degree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        // Input
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                arr[row][col] = sc.nextInt();
            }
        }

        // Step 1: Transpose (In-place)
        for (int row = 0; row < n; row++) {
            for (int col = row + 1; col < n; col++) {

                int temp = arr[row][col];
                arr[row][col] = arr[col][row];
                arr[col][row] = temp;
            }
        }

        // Step 2: Reverse each row
        for (int row = 0; row < n; row++) {

            int left = 0;
            int right = n - 1;

            while (left < right) {

                int temp = arr[row][left];
                arr[row][left] = arr[row][right];
                arr[row][right] = temp;

                left++;
                right--;
            }
        }

        // Output
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}