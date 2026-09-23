package module_2.array_1.prefix_suffix_techniques;
import java.util.*;

public class prefix_max {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] prefixMax = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        prefixMax[0] = arr[0];

        for (int i = 1; i < n; i++){
            prefixMax[i] = Math.max(arr[i], prefixMax[i-1]);
        }


        for (int i = 0; i < n; i++){
            System.out.println(prefixMax[i] + " ");
        }

        sc.close();
    }
}
