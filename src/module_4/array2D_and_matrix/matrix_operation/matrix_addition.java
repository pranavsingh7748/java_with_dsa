package module_4.array2D_and_matrix.matrix_operation;
import java.util.*;

public class matrix_addition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] A = new int[rows][cols];
        int[][] B = new int[rows][cols];
        int[][] C = new int[rows][cols];


        for (int row = 0; row < rows; row++){
            for (int col = 0; col < cols; col++){
                A[row][col] = sc.nextInt();
            }
        }

        for (int row = 0; row < rows; row++){
            for (int col = 0; col < cols; col++){
                B[row][col] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){

                C[i][j] = A[i][j] + B[i][j];
            }
        }

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }


        sc.close();

    }
}
