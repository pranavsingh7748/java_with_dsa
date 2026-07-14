package module_2.arraylist;
import java.util.*;
public class find_max_sum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }

        int sum = 0;
        for (int i = 0; i < list.size(); i++){

            sum = sum + list.get(i);
        }
        System.out.println(sum);
    }
}
