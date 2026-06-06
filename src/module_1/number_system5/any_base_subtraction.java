// // Any base Subtraction

package module_1.number_system5;

import java.util.Scanner;

public class any_base_subtraction {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int d = getDifference(b,n1,n2);
        System.out.println(d);
    }

    public static int getDifference(int b, int n1, int n2){
        int rv = 0;
        int p = 1;
        int borrow = 0;

        while (n2 > 0){
            int d1 = n1 % 10;
            n1 = n1 / 10;
            int d2 = n2 % 10;
            n2 = n2 / 10;

            int d  = 0;
            d2 = d2 + borrow;

            if (d2  >= d1){
                borrow = 0;
                d = d2 - d1;
            } else {
                borrow = -1;
                d = d2 + b - d1;
            }

            rv = rv + d * p;
            p = p * 10;

        }


        return rv;
    }
}
