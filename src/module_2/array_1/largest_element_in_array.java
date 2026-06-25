package module_2.array_1;
import java.util.*;
public class largest_element_in_array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");

        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element of array: ");

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n - 1 -i; j++){

                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Largest element of this array is : " + arr[n - 1]);
    }
}
