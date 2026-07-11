package module_2.multidimentional;

import java.util.Scanner;

public class input_output {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int[][] arr= new int[3][3];
        System.out.println(arr.length); // number of rows

        // input

        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                // for each col in every row
                arr[row][col] = sc.nextInt();
            }
        }

        // output

        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                // for each col in every row
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();

        }
    }
}
