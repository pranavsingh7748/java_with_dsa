package module_2.array_1.searching;
import java.util.*;
public class lower_bound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int data = sc.nextInt();

        int l = 0;
        int h = arr.length - 1;
        int lowerIndex = -1;

        while (l <= h) {

            int m = l + (h - l) / 2;

            if (arr[m] >= data) {
                lowerIndex = m;
                h = m - 1;
            } else {
                l = m + 1;
            }
        }

        System.out.println("Lower Bound Index: " + lowerIndex);

        sc.close();
    }
}
