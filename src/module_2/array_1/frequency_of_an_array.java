package module_2.array_1;
import java.util.*;
public class frequency_of_an_array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] a = new int[n1];
        for (int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }

        int count = 0;
        for(int i = 0; i < a.length; i++){
            if (a[i] == n2){
                count ++;
            }
        }

        System.out.println("Frequency of " + n2 + " = " + count);
    }
}
