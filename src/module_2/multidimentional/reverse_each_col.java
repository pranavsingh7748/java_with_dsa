package module_2.multidimentional;
import java.util.*;
public class reverse_each_col {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];
        for (int row = 0; row < rows; row++){
            for (int col = 0; col < cols;col++){
                arr[row][col] = sc.nextInt();
            }
        }

        for (int col = 0; col < cols; col++){

            int top = 0;
            int bottom = rows - 1;

            while (top < bottom){
                int temp = arr[top][col];
                arr[top][col] = arr[bottom][col];
                arr[bottom][col] = temp;
                top++;
                bottom--;
            }
        }

        for (int row = 0; row < rows; row++){
            for (int col = 0; col < cols; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
        sc.close();


    }
}