package module_2.array_1;
import java.util.*;
public class find_even_or_odd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }

        int evencount = 0;
        int oddcount = 0;
         for(int i = 0; i < a.length; i++){

            if (a[i] % 2 == 0){
                System.out.println( a[i] + " is even");
                evencount++;

            }
            else {
                System.out.println(a[i] + " is odd");
                oddcount++;
            }

        }
        System.out.println("The total even number is " + evencount);
        System.out.println("The total odd number is " + oddcount);

    }
}
