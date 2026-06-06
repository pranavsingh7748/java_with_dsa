// factorial
package module_1.loop_2;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        int nface = 1;
        for (int i = 1; i <= n; i++){
            nface *= i;
        }
        int nmrface = 1;
        for (int i = 1; i <= n - r; i++){
            nmrface *= i;
        }
        int npr = nface / nmrface;
        System.out.println(n + "p" + r + "=" + npr);
    }
}
