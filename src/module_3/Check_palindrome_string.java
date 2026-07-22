package module_3;
import java.util.*;

public class Check_palindrome_string {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
         String s = sc.nextLine();

         int left = 0;
         int right = s.length() - 1;
        boolean isPalindrome = true;

        while (left <= right) {

            if (s.charAt(left) != s.charAt(right)) {

                isPalindrome = false;
                break;
             }


            left++;
            right--;


        }
        if (isPalindrome) {

            System.out.println("Palindrome");

        } else {

            System.out.println("Not Palindrome");

        }


    }
}
