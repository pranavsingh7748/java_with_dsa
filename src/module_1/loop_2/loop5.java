// Count Digit In Number

package module_1.loop_2;

import java.util.Scanner;

public class loop5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while (n!=0){
            n = n / 10;
            count++;
        }

        System.out.println(count);
    }
}
