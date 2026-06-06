// FIND MAXIMUM ELEMENT

package module_2.array_1;
import java.util.*;
public class find_max {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] a1 = new int[n1];
        for(int i = 0; i < a1.length; i++){
            a1[i] = sc.nextInt();
        }
        int max = a1[0];
        for(int i = 0; i < a1.length; i++){

            if (a1[i] > max){
                max = a1[i];
            }
        }

        System.out.println("maximum Element is " + max);
    }
}
