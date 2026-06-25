// CHECK ARRAY IS SHORTED OR NOT

package module_2.array_1;
import java.util.*;
public class shorted_an_array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }

        boolean shorted = true;
        for (int i = 0; i < a.length -1; i++){
            if(a[i] > a[i+1]){
                shorted = false;
                break;
            }
        }

        if (shorted ){
            System.out.println("shorted");

        } else {
            System.out.println("not shoted");
        }
    }
}
