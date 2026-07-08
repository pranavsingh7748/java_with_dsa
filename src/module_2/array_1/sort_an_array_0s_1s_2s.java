package module_2.array_1;
import java.util.*;
public class sort_an_array_0s_1s_2s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int zero = 0;
        int one = 0;
        int two = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                zero++;
            } else if (arr[i] == 1) {
                one++;

            } else {
                two++;
            }
        }

        for(int i = 0; i < arr.length; i++){
            if (zero > 0){
                arr[i] = 0;
                zero--;
            } else if (one > 0) {
                arr[i] = 1;
                one--;
            } else {
                arr[i] = 2;
                two--;
            }
        }

        System.out.println("Sorted array :  ");
        for(int i = 0; i < n; i++){
            System.out.println(arr[i] + " ") ;
        }
    }
}
