package module_2.array1D.array_manipulation;
import java.util.*;

public class merge_two_arrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];

        for (int i = 0; i < n1; i++){
            arr1[i] = sc.nextInt();
        }

         int n2 = sc.nextInt();
        int[] arr2 = new int[n2];

        for (int i = 0; i < n2; i++){
            arr2[i] = sc.nextInt();
        }

        int[] marge = new int[n1 + n2];

        for (int i = 0; i < n1; i++){
            marge[i] = arr1[i];
        }


        for (int i = 0; i < n2; i++){
            marge[n1 + i] = arr2[i];
        }


        for (int i =0; i < marge.length; i++){
            System.out.print(marge[i] + " ");
        }

        sc.close();

    }
}
