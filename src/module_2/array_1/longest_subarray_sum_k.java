package module_2.array_1;
import  java.util.*;
public class longest_subarray_sum_k {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        int maxLength = 0;

        for(int i = 0; i < n; i++){
            int sum = 0;

            for(int j = i; j < n; j++){
                sum += arr[j];

                if(sum == k){
                    int length = j - i + 1;

                    if(length > maxLength){
                        maxLength = length;
                    }
                }

            }
        }
        System.out.println("Longrst subarray is : " + maxLength);
    }
}
