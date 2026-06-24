package module_1.condiational_1;
import java.util.*;
public class check_leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year : ");

        int year = sc.nextInt();

        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0){
            System.out.println("This year is a leap year");

        } else {
            System.out.println("This year is not a leap year");
        }
    }
}
