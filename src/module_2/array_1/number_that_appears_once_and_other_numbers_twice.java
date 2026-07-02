package module_2.array_1;
import java.util.*;
public class number_that_appears_once_and_other_numbers_twice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int value = 0;
        for(int i = 0; i < n; i++){
            value = value ^ arr[i];
        }

        System.out.println("Appear once number is : " + value);
    }
}
