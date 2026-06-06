// Any base to Decimal

package module_1.number_system5;

import java.util.Scanner;

public class any_base_to_decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int d = getValueInDecimal(n,b);
        System.out.println(d);
    }

    public static int getValueInDecimal(int n,int b){
        int rv = 0;
        int p = 1;
        while (n > 0){
            int digt = n % 10;
            n = n / 10;

            rv += digt * p;
            p = p * b;
        }


        return rv;
    }
}
