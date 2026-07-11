package module_2.array_1;
import java.util.*;
public class next_permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int index = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                index = i;
                break;

            }
        }

        if (index == -1) {
            reverse(arr, 0, n - 1);
        } else {
            for (int i = n - 1; i > index; i--) {
                if (arr[i] > arr[index]) {
                    int temp = arr[i];
                    arr[i] = arr[index];
                    arr[index] = temp;
                    break;
                }
            }

            reverse(arr, index + 1, n - 1);
        }

        System.out.println("Next Permutation : ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }

    }

    public static void reverse(int[] arr, int left, int right){
        while (left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}
