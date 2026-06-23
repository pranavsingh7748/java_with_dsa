package module_1.loop_2;
import java.util.*;
public class find_the_largest_among_n_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of number : ");
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;

        for(int i = 1; i <= n; i++){
            int num = sc.nextInt();
            if(num > max){
                max = num;
            }
        }
        System.out.println("Largest number is = " + max);
    }
}
