// inverse of a number
//Position becomes Value, and Value becomes Position

// if question is 15234 we are numbering in right side then answer will be come 41235

package module_1.loop_2;

import java.util.*;

public class loop8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int inv = 0; // inverse
        int op = 1; // original place
        while(n !=0){
            int od = n % 10; // original digit
            int id =op; // inverted digit
            int ip = od; // inverted place

            // make change to inv using id and ip
            inv = inv + id * (int)Math.pow(10,ip - 1);

            n = n/10;
            op++;
        }
        System.out.println(inv);

    }
}
