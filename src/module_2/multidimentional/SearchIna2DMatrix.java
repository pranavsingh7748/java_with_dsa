package module_2.multidimentional;

import java.util.*;

public class SearchIna2DMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        // Input matrix
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                arr[row][col] = sc.nextInt();
            }
        }

        // Input target
        int target = sc.nextInt();


        boolean found = false;

        // Search target
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {

                if (arr[row][col] == target) {
                    found = true;
                    break;
                }
            }

            if (found) {
                break;
            }
        }

        System.out.println(found);

        sc.close();
    }
}