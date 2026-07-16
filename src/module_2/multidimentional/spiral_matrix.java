package module_2.multidimentional;

import java.util.*;

public class spiral_matrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        // Input
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                arr[row][col] = sc.nextInt();
            }
        }

        int top = 0;
        int bottom = rows - 1;
        int left = 0;
        int right = cols - 1;

        while (top <= bottom && left <= right) {

            //  Left to Right
            for (int col = left; col <= right; col++) {
                System.out.print(arr[top][col] + " ");
            }
            top++;

            //  Top to Bottom
            for (int row = top; row <= bottom; row++) {
                System.out.print(arr[row][right] + " ");
            }
            right--;

            //  Right to Left
            if (top <= bottom) {
                for (int col = right; col >= left; col--) {
                    System.out.print(arr[bottom][col] + " ");
                }
                bottom--;
            }

            //  Bottom to Top
            if (left <= right) {
                for (int row = bottom; row >= top; row--) {
                    System.out.print(arr[row][left] + " ");
                }
                left++;
            }
        }

        sc.close();
    }
}