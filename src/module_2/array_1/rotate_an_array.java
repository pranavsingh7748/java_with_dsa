package module_2.array_1;
import java.util.*;
public class rotate_an_array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < a.length;i++){
            a[i] = sc.nextInt();
         }
        int p = sc.nextInt();
        p = p % n;


        for (int r = 0; r < p; r++) {
            int i = 0;
            int j = a.length - 1;
            int temp = a[0];

            while (i < j) {
                a[i] = a[i + 1];
                i++;
            }
            a[j] = temp;
        }
         for (int k = 0; k < a.length; k++){
            System.out.println(a[k] + " ");
        }
    }
}





