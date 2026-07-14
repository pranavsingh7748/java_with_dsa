package module_2.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class find_min {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        int  n = sc.nextInt();

        for (int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }

        int min = list.get(0);

        for (int i = 0; i < list.size(); i++){

            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        System.out.println("Minimum element is : " + min);
    }
}
