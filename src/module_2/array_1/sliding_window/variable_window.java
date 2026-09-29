package module_2.array_1.sliding_window;
import java.util.*;

public class variable_window {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int left = 0;
        int sum = 0;
        int minLength =  n + 1;


        for (int right = 0; right < n; right++){
            sum += arr[right];
        }


        int target = 0;
        int right = 0;
        while (sum >= target){
            int currentLength = right - left + 1;

            if(currentLength < minLength){
                minLength = currentLength;
                sum -= arr[left];
                left++;
            }
        }

    }
}
