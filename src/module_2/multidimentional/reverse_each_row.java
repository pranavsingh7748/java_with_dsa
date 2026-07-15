package module_2.multidimentional;
import java.util.*;
public class reverse_each_row {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        for(int row = 0; row < rows; row++){
            for (int col = 0; col < cols; col++){
                arr[row][col] = sc.nextInt();
            }
        }


        for(int row = 0; row < rows; row++){

            int left = 0;
            int right = cols - 1;

            while (left < right){

                int temp = arr[row][left];
                arr[row][left] = arr[row][right];
                arr[row][right] = temp;
                left++;
                right--;
            }
        }

        for (int row = 0; row < rows; row++){
            for(int col = 0; col < cols; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
        sc.nextInt();
    }
}
