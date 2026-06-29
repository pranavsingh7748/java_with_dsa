package module_2.array_1;
import java.util.*;
public class left_rotate_array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        for(int r = 0; r < k; r++){
            int temp = arr[0];

            for(int i = 0; i < n -1; i++){
                arr[i] = arr[i+1];
            }
            arr[n-1] = temp;
        }

        for(int i = 0; i < n; i++){
            System.out.println(arr[i] + " ");
        }
    }

}
