package module_2.array_1;
import java.util.*;
public class inverse_an_array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        int[] inverse = new int[n];
        for (int i = 0; i < n; i++){
            inverse[a[i]] = i;
        }

        System.out.println("Inverse Array : ");

        for (int i = 0; i < n;i++){
            System.out.println( inverse[i]+ " ");
        }

    }
}
