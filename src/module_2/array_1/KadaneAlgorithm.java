package module_2.array_1;
import  java.util.*;
public class KadaneAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n  = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

         int sum = 0;
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){

            sum += arr[i];

            if(sum > max){
                max = sum;

            }
            if(sum < 0){
                sum = 0;
            }
        }
        System.out.println(max);
    }
}
