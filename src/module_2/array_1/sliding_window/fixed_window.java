package module_2.array_1.sliding_window;
import java.util.*;

public class fixed_window {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        int windowSum = 0;

        for (int i = 0; i < k; i++){
            windowSum = windowSum + arr[i];
        }

        int maxSum = windowSum;
        for (int i = k; i < n; i++){

            windowSum -= arr[i-k];

            windowSum+= arr[i];

            if (windowSum > maxSum){
                maxSum = windowSum;
            }
        }


        System.out.println("Maximum Sum = " + maxSum );

        sc.close();
    }
}
