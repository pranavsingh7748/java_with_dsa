package module_2.array_1;
import java.util.*;
public class sum_of_array_elements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc. nextInt();
        int[] a = new int[n];
        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i = 0; i < a.length; i++){
            sum+= a[i];
        }
        System.out.println("Sum of elment is " + sum);
    }
}
