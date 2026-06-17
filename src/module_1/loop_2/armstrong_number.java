package module_1.loop_2;
import  java.util.*;
public class armstrong_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int count = 0;


        while (temp != 0){
            count++;
            temp = temp / 10;
        }

        temp = n;
        int sum = 0;

        while (temp!=0){
            int digit = temp % 10;
            sum += (int) Math.pow(digit, count);
            temp = temp / 10;
        }
        if(sum == n){
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }
}
