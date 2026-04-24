//  print prime or not inn rang
package module_1.loop_2;
import java.util.*;

public class loop3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();

        for(int i = low; i<=high;i++){
            int count = 0;


            // try to divide n and increase the value
            for(int div = 2; div * div <=i; div ++){
                if(i%div ==0){
                    count++;
                    break;
                }
            }

            // try to divide n and increase count

            if(count==0){
                System.out.println(i);
            }
        }

    }
}



