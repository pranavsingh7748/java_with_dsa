package module_4.array2D_and_matrix.matrix_searching;
import java.util.*;

public class rotate_270 {
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


        int[][] result = new int[cols][rows];
        for (int row = 0; row < rows; row++){
            for (int col = 0; col < cols; col++){

                result[cols - 1 - col][row] = arr[row][col];
            }
        }


        for (int row = 0; row < cols; row++) {
            for (int col = 0; col < rows; col++) {
                System.out.print(result[row][col] + " ");
            }
            System.out.println();
        }
    }
}
