package module_2.array1D.two_pointer;
import java.util.*;

public class two_some_in_shorted_array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int left = 0;
        int right = arr.length - 1;

        boolean found = false;

        while (left < right) {

            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println("Pair is : " + left + " " + right);
                found = true;
                break;
            }

            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        if (!found) {
            System.out.println("No pair found");
        }

        sc.close();
    }
}
