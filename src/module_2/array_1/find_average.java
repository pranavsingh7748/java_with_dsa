package module_2.array_1;
import java.util.*;
public class find_average {
    public static void main(String[] arge){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        int sum = 0;
        double avg = 0;
         for(int i = 0; i < n; i++){
             sum+=a[i];
            avg = (double) sum / n;
        }
        System.out.println("The average of this array is " +avg);
    }
}
