package module_4.array2D_and_matrix.advanced_matrix_problem;

import java.util.*;

public class digonal_traversal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        // Matrix input
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                arr[row][col] = sc.nextInt();
            }
        }

         for (int g = 0; g < cols; g++) {

            int row = 0;
            int col = g;

            while (row < rows && col < cols) {
                System.out.print(arr[row][col] + " ");
                row++;
                col++;
            }
        }

         for (int g = 1; g < rows; g++) {

            int row = g;
            int col = 0;

            while (row < rows && col < cols) {
                System.out.print(arr[row][col] + " ");
                row++;
                col++;
            }
        }

        sc.close();
    }
}