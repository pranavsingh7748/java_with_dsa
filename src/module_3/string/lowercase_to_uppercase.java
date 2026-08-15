package module_3.string;
import java.util.*;

public class lowercase_to_uppercase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int lowerCase = 0;
        int upperCase = 0;

        for (int i = 0; i < s.length(); i++){

            char ch = s.charAt(i);

            if (Character.isUpperCase(ch)) {

                System.out.print(Character.toLowerCase(ch));

            } else if (Character.isLetter(ch)) {
                System.out.print(Character.toUpperCase(ch));

            } else {
                System.out.println(ch);
            }
        }

        sc.close();
     }
}
