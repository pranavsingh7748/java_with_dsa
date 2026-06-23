package module_2.array_1;

import java.util.Scanner;

public class shorting_an_array {
    public static void amin(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array");

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n-1; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++ ){
            for(int j = 0; j < n - 1 - i; j++){

                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }

        System.out.println("Shorted array : " );

        for(int i = 0; i < n; i++){
            System.out.println(arr[i] + " ");
        }

        sc.close();
    }
}
