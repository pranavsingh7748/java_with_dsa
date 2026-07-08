package module_2.array_1;
import java.util.*;
public class two_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        boolean found = false;
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){

                if (arr[i] + arr[j] == target){
                    System.out.println("Pair is : " + i + " " + j);
                    found = true;
                    break;
                }
            }
            if (found){
                break;
            }
        }
        if(!found){
            System.out.println("No pair found ");
        }
    }
}
