package module_2.arraylist;
import java.util.*;
public class find_max {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }


        int max = list.get(0);
        for(int i = 0; i < list.size(); i++){

            if (list.get(i) > max){
                max = list.get(i);
            }
        }

        System.out.println("Maximum element is : " + max);
    }
}
