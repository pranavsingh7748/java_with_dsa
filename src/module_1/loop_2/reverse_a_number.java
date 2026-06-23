package module_1.loop_2;
import java.util.*;
public class reverse_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int reverse = 0;

        while (n != 0){
            reverse = reverse * 10 + n % 10;
            n /= 10;
        }

        System.out.println(reverse);
    }
}
