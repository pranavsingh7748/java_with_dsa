package module_2.array_1;
import java.util.*;
public class reverse_of_an_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();;
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }

        int i = 0;
        int j = a.length-1;

        while (i < j){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        System.out.println("Reversed array");

        for (int k = 0; k < a.length; k++){
            System.out.println(a[k] + " ");
        }

    }
}
