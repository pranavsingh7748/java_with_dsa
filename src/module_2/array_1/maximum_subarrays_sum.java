package module_2.array_1;
import  java.util.*;
public class maximum_subarrays_sum {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int sum = 0;

        for(int i = 0; i < n; i++){
            sum = sum + arr[i];
            if(sum > max){
                max = sum;
            }

            if (sum < 0){
                sum = 0;
            }
        }

        System.out.println("The maximun sum of subarray is : " + max);
    }
}
