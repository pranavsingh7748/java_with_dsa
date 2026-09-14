package module_2.array_1.searching;

import java.util.*;

public class binary_search_in_array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array element : ");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target : ");
        int data = sc.nextInt();

        int l = 0;
        int h  = arr.length-1;

        while (l <= h){
            int m = l + (h - l) / 2;

            if (data > arr[m]){
                l = m + 1;

            } else if (data < arr[m]) {
                h = m -1;

            } else {
                System.out.println(m);
                return;
            }
        }
        System.out.println(-1);
    }
}
