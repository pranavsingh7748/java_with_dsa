// factorial
package module_1.function_4;

import java.util.Scanner;

public class factorial {

    public static void display (int n , int r, int npr){
        System.out.println(n + "p" + r + "=" + npr);
    }
    public static int fact(int x){
        int rv = 1;
        for (int i = 1; i <= x; i++){
            rv = rv * i;
        }
        return rv;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        int nface = fact(n);
        int nmrface = fact(n-r);

        int npr = nface / nmrface;
//        System.out.println(n + "p" + r + "=" + npr); // i want to clear this line and create a new function to print sout
        display(n,r,npr);
     }
}
