package module_2.multidimentional;
import java.util.Scanner;
public class a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Ask for the number of rows
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        // 2. Declare the 2D array with the number of rows, but leave columns empty
        int[][] arr = new int[rows][];

        // 3. Loop to set the columns for each row and input the elements
        for (int row = 0; row < arr.length; row++) {

            System.out.print("Enter the number of columns for row " + (row + 1) + ": ");
            int cols = sc.nextInt();

            // Initialize the specific row with the chosen number of columns
            arr[row] = new int[cols];

            System.out.println("Enter the " + cols + " elements for row " + (row + 1) + ": ");
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }

        // 4. Print the completed multidimensional array
        System.out.println("\nYour custom multidimensional array is:");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println(); // Move to the next line after printing a row
        }

        // Always good practice to close the scanner!
        sc.close();
    }
}