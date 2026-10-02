package module_2.array1D.sliding_window;
import java.util.*;

public class variable_window {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

         int n = sc.nextInt();

         int target = sc.nextInt();

        int[] arr = new int[n];

         for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int left = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

         for (int right = 0; right < n; right++) {
            sum += arr[right];

             while (sum >= target) {
                int currentLength = right - left + 1;

                if (currentLength < minLength) {
                    minLength = currentLength;
                }

                 sum -= arr[left];
                left++;
            }
        }

         if (minLength == Integer.MAX_VALUE) {
            System.out.println(0);
        } else {
            System.out.println(minLength);
        }

        sc.close();
    }
}