package module_2.multidimentional;
import java.util.*;
public class transpose {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];
        int[][] transpose = new int[cols][rows];

        for (int row = 0; row < rows; row++){
            for (int col = 0; col < cols; col++){
                arr[row][col] = sc.nextInt();
            }
        }

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                transpose[col][row] = arr[row][col];
            }
         }
        for (int row = 0; row < cols; row++) {
            for (int col = 0; col < rows; col++) {
                System.out.print(transpose[row][col] + " ");
            }
            System.out.println();
        }
    }
}
