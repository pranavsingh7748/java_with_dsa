// Decimal to any Base

package number_system;

import java.util.Scanner;

public class number_system1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int dn = getValueInBase(n,b);
        System.out.println(dn);
    }

    public static int getValueInBase(int n , int b){
        int rv = 0;
        int p = 1; // p = power (0)
        while (n > 0){
            int digt = n % b;
            n = n / b;
            rv += digt * p;
            p = p * 10;
        }
        return rv;
    }
}
