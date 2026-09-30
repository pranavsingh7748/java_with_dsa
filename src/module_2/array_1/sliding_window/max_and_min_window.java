package module_2.array_1.sliding_window;
import java.util.*;

public class max_and_min_window {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

         int n = sc.nextInt();

        int[] arr = new int[n];
         for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

         int k = sc.nextInt();

        if (k > n || k <= 0) {
            System.out.println("Invalid window size.");
            sc.close();
            return;
        }

        int currentSum = 0;

         for (int i = 0; i < k; i++){
            currentSum += arr[i];
        }

        int maxSum = currentSum;
        int minSum = currentSum;

         for (int i = k; i < n; i++) {
             currentSum = currentSum + arr[i] - arr[i - k];

             if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            if (currentSum < minSum) {
                minSum = currentSum;
            }
        }

        System.out.println("Maximum sum: " + maxSum);
        System.out.println("Minimum sum: " + minSum);

        sc.close();
    }
}