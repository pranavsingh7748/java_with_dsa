package module_2.array_1;
import java.util.*;
public class second_largest_element_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");

        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");

        for(int i = 0; i < n; i ++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n-1;i++){
            for(int j = 0; j < n - 1 -i; j++){

                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Second Largest Element of this array is : " + arr[n-2]);
    }
}
