package module_2.arraylist;
import java.util.*;
public class print_all_element {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        int n = sc.nextInt();


        for(int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }

        System.out.println(list);

    }
}


