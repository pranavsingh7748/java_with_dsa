package module_2.multidimentional;
import java.util.*;

public class col_sum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                arr[row][col] = sc.nextInt();
            }
        }

        for (int col = 0; col < cols; col++){

            int sum = 0;
            for (int row = 0; row < rows; row++){

                sum += arr[row][col];
            }
            System.out.println(sum);
        }
    }
}
