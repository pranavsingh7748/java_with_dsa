package module_2.arraylist;
import java.util.*;
public class more_then_element_if_size_fixed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }

        while (true) {

            int num = sc.nextInt();

            if (num == -1) {      // -1 means stop
                break;
            }

            list.add(num);
        }

        System.out.println(list);
    }
}
