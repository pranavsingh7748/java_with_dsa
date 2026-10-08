package module_4.array2D_and_matrix.advanced_matrix_problem;
import java.util.*;

public class rotate_180 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        for (int row = 0; row < rows; row++){
            for (int col = 0; col < cols; col++){
                arr[row][col] = sc.nextInt();
            }
        }


        int total = rows * cols;
        for (int i = 0; i < total / 2; i++){

            int opposite = total - 1 - i;

            int row1 = i / cols;
            int col1 = i % cols;

            int row2 = opposite / cols;
            int col2 = opposite % cols;

            int temp = arr[row1][col1];
            arr[row1][col1] = arr[row2][col2];
            arr[row2][col2] = temp;

        }

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(arr[row][col] + " ");

            }
            System.out.println();

        }



    }
}
