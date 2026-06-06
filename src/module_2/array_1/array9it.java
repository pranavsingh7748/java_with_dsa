// CHECK ARRAY IS SHORTED OR NOT

package module_2.array_1;
import java.util.*;
public class array9it {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] a1 = new int[n1];
        for(int i = 0; i < a1.length; i++){
            a1[i] = sc.nextInt();
        }

        boolean shorted = true;
        for (int i = 0; i < a1.length -1; i++){
            if(a1[i] > a1[i+1]){
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
