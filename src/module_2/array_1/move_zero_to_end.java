package module_2.array_1;
import java.util.*;
public class move_zero_to_end {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int j = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        for(int i = 0; i < n; i++){
            System.out.println(arr[i] + " ");
        }
    }
}
