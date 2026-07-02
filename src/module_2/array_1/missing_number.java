package module_2.array_1;
import java.util.*;
public class missing_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }

        int actualSum = (n * (n + 1)) / 2;
        int missingSum = actualSum - sum;
        System.out.println("Missing Number is : " + missingSum);
    }

}
