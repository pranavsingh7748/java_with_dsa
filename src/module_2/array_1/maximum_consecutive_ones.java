package module_2.array_1;
import java.util.*;
public class maximum_consecutive_ones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int count = 0;
        int max = 0;

        for(int i = 0; i < n; i++){
            if (arr[i] == 1){
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }

        }
        System.out.println("Maximum ones is : " + max);


    }
}
