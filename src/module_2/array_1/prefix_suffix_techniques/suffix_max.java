package module_2.array_1.prefix_suffix_techniques;
import  java.util.*;

public class suffix_max {
    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int[] arr = new int[n];
         int[] suffixMax = new int[n];

         for (int i = 0; i < n; i++){
             arr[i] = sc.nextInt();
         }

        suffixMax[n-1] = arr[n-1];

        for (int i = n - 2; i >= 0; i--){
            suffixMax[i] = Math.max(arr[i], suffixMax[i+1]);
        }


        for (int i = 0; i < n; i++){
            System.out.println(suffixMax[i] + " ");
        }

        sc.close();
    }
}
