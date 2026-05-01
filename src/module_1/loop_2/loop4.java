// print Fibonacci Number
package module_1.loop_2;

import java.util.*;

public class loop4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;

        for(int i =0;i<n;i++){
            System.out.println(a);
            int c = a +b;
            a=b;
            b=c;
        }
     }
}
