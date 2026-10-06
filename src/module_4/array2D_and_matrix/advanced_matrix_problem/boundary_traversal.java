package module_4.array2D_and_matrix.advanced_matrix_problem;
import java.util.*;

public class boundary_traversal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        for (int row = 0; row < rows; row ++){
            for (int col= 0; col < cols; col++){
                arr[row][col] = sc.nextInt();
            }
        }

         for (int col = 0; col < cols; col++) {
            System.out.print(arr[0][col] + " ");
        }

         for (int row = 1; row < rows; row++) {
            System.out.print(arr[row][cols - 1] + " ");
        }

         for (int col = cols - 2; col >= 0; col--) {
            System.out.print(arr[rows - 1][col] + " ");
        }

         for (int row = rows - 2; row >= 1; row--) {
            System.out.print(arr[row][0] + " ");
        }

         sc.nextInt();
    }
}
