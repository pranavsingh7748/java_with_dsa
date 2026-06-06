// find the element an array

package module_2.array_1;
import java.util.*;
public class span_of_an_array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int data = sc.nextInt();
        int idx = -1;
        for (int i = 1; i < arr.length; i++){
            if (arr[i] == data){
                idx = i;
                break;
            }
        }
        System.out.println(idx);
    }
}
