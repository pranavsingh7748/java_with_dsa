// print GCD and LCM
package module_1.loop_2;

import java.util.Scanner;

public class loop10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int on1=n1; // on = original
        int on2 = n2;

        while (n1 % n2 !=0){
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }

        int gcd = n2; //GCD= greatest commom divisior
        int lcm = (on1 * on2)/gcd;

        System.out.println(gcd);
        System.out.println(lcm);
    }
}
