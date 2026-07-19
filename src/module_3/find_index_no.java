package module_3;
import  java.util.*;

public class find_index_no {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();


        for (int i = 0; i < s.length(); i ++){

            char ch = s.charAt(i);

            System.out.println("index " + i + " : " + ch );

        }

        sc.close();
    }
}
