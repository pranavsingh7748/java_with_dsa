package module_2.array_1;
import java.util.*;
public class leaders_in_an_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int max = arr[n - 1];
        System.out.print(max + " ");

        for(int i = n - 2; i >= 0; i--){

            if (arr[i] > max){
                System.out.print(arr[i] +  " ");
                max = arr[i];
            }
        }
    }
}
