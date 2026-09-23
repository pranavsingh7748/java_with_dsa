package module_2.array_1.prefix_suffix_techniques;
import java.util.*;

public class prefix_sum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] prefix = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        prefix[0] = arr[0];

        for (int i = 1; i < n; i++){
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < n; i++){
            System.out.println(prefix[i] + " ");
        }

        sc.close();
    }
}
