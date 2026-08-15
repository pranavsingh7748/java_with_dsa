package module_3.string;
import java.util.*;

public class Count_digits_and_special_characters {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

         int dig = 0;
        int sp = 0;

        for (int i = 0; i < s.length(); i++){

            char ch= Character.toLowerCase(s.charAt(i));

            if (Character.isDigit(ch)) {
                dig++;
            }

            if (!Character.isLetter(ch)
                    && !Character.isDigit(ch)
                    && !Character.isWhitespace(ch)) {

                sp++;
            }

        }
        System.out.println("Digits : " + dig);
        System.out.println("Special Characters : " + sp);

        sc.close();
    }
}
