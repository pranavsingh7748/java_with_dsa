package module_1.loop_2;
import java.util.*;
public class gcd_and_lcm_for_n_numbers {

    public static int gcd(int a, int b){
        while (b!=0){
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }
    public static int lcm(int a, int b){
        return (a * b) / gcd(a, b);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many number : ");
        int n = sc.nextInt();

        int gcdresult = sc.nextInt();
        int lcmresult = gcdresult;

        for(int i = 1; i < n; i++){
            int num = sc.nextInt();

            gcdresult = gcd(gcdresult,num);
            lcmresult = lcm(lcmresult,num);

        }

        System.out.println("GCD = " + gcdresult);
        System.out.println("LCM = " + lcmresult);
    }
}
