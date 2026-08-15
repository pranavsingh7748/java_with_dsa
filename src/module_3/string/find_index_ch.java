package module_3.string;
import java.util.*;

public class find_index_ch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        char target = sc.next().charAt(0);

        int idx = s.indexOf(target);

        System.out.println("Index of " + target + " : " + idx);


    }
}
