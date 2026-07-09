package module_2.array_1;
import  java.util.*;
public class RearrangeArrayElementsBySign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int[] ans = new int[n];

        int positiveIndex = 0;
        int negativeIndex = 1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                ans[positiveIndex] = arr[i];
                positiveIndex = positiveIndex + 2;
            } else {
                ans[negativeIndex] = arr[i];
                negativeIndex = negativeIndex + 2;
            }
        }
        System.out.println("Rearranged Array : " );

        for (int i = 0; i < n; i++){
            System.out.println(ans[i] + " ");
        }
    }
}
