package module_2.array_1;
import java.util.*;
public class remove_duplicate_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of array : ");

        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element of an array: ");

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print(arr[0] + " ");
        for(int i = 1; i < n; i++){
            if(arr[i] != arr[i - 1]){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
