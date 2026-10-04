package module_4.array2D_and_matrix.matrix_searching;
import java.util.*;

public class search_in_sorted_2D_matrix {
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

        int row = 0;
        int col = cols - 1;
        boolean found = false;
        int target = sc.nextInt();

        while  (row < rows && col >= 0){

            int current = arr[row][col];

            if (current > target){
                col --;
            } else if (current < target) {
                row ++;
            } else {
                found = true;
                break;
            }
        }

        System.out.println(found);
        sc.close();

    }
}
