// Any Base to Any Base

package module_1.number_system5;

import java.util.Scanner;

public class number_system3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int d = getValueInAnyBase(n,b1,b2);
        System.out.println(d);
    }

    public static int getValueInAnyBase(int n, int b1, int b2){
        int dec = anyBaseToDeciml(n, b1);
        int dn = decimalToAnyBase(dec, b2);
        return dn;
    }
    public static int decimalToAnyBase(int n , int b){
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

    public static int anyBaseToDeciml(int n,int b){
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
