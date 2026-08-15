package module_3.string;
import java.util.*;
public class CountVowelsAndConsonants {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < s.length(); i++){

            char ch = Character.toLowerCase(s.charAt(i));

            if (Character.isLetter(ch)){

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    vowels++;
                }

                else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels : " + vowels);
        System.out.println("Consonats : " + consonants);

        sc.close();
    }
}
