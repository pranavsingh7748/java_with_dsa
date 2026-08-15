package module_3.string;
import java.util.*;

public class count_words {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int spaceCount = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        System.out.println(spaceCount + 1);
    }
}
