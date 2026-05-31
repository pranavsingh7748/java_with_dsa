// sum of two array

package module_2.array_1;
import java.util.*;
public class array7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n1= sc.nextInt();
        int[] a1 = new int[n1];
        for (int i = 0; i < a1.length;i++){
            a1[i] = sc.nextInt();
        }

        int n2= sc.nextInt();
        int[] a2 = new int[n2];
        for (int i = 0; i < a2.length;i++){
            a2[i] = sc.nextInt();
        }

        int[] sum = new int[n1 > n2? n1:n2];  //  int[b1 > n1? n:n] iska mtlb h ki agar n1 n2 se bada h to n1 print hoga nhi ho n2 print hoga
        int c = 0;

        int i = a1.length - 1;
        int j = a2.length - 1;
        int k = sum.length - 1;

        while (k >= 0 ){
            int d = c;

            if (i >= 0){
                d += a1[i];
            }
            if (j >= 0){
                d += a2[j];
            }

            c = d / 10;
            d = d % 10;

            sum[k] = d;

            i--;
            j--;
            k--;

        }

        if (c!=0){
            System.out.println(c);
        }

        for(int val: sum){
            System.out.println(val);
        }
    }
}
