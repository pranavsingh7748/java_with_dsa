// prime or not

package condiational;
import java.util.*;

public class loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i =0;i<t;i++){
            int n = sc.nextInt();

            int count =0;
            for(int div=1;div<=n;div++){
                if(n%div==0){
                    count++;
                }

            }

            if(count==2){
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }
        }

    }
}


// this code takes so many time to find prime or not