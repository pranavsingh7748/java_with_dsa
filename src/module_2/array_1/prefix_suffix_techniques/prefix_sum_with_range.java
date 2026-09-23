package module_2.array_1.prefix_suffix_techniques;
import java.util.*;

public class prefix_sum_with_range {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] prifix = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        prifix[0] = arr[0];

        for (int i = 1; i < n; i++){
            prifix[i] = prifix[i - 1] + arr[i];
        }

        int start = sc.nextInt();
        int end = sc.nextInt();

        int sum ;

        if(start == end){
            sum = prifix[end];
        }else {
            sum = prifix[end] - prifix[start - 1];
        }

        System.out.println("Range sum = "  + sum);

        sc.close();
    }
}
