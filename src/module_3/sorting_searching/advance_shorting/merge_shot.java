package module_3.sorting_searching.advance_shorting;
import java.util.*;

public class merge_shot {

     public static void mergeSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = low + (high - low) / 2;

         mergeSort(arr, low, mid);
        mergeSort(arr,mid + 1, high);

         merge(arr, low, mid, high);
    }

     public static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

         while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

         while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

         while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

         for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        int[] arr = new int[n];

         for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int low = 0;
        int high = n - 1;


        mergeSort(arr, low, high);

         System.out.println("Sorted Array: ");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}