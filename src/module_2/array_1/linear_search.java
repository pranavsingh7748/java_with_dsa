package module_2.array_1;
import java.util.*;
public class linear_search {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int element = sc.nextInt();
        boolean found = false;

        for(int i = 0; i < n; i++ ){
            if(arr[i] == element){
                System.out.println("ELement Found at Index " + i);
                found = true;
            }
        }

        if(!found){
        System.out.println("Element not Found");

        }
    }
}
