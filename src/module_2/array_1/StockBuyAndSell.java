package module_2.array_1;
import java.util.*;
public class StockBuyAndSell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i]= sc.nextInt();
        }

        int minPrice = arr[0];
        int maxProfit = 0;

        for(int i = 1; i < arr.length; i++){

            int currentProfit = arr[i] - minPrice;

            if(currentProfit > maxProfit){
                maxProfit = currentProfit;
            }
            if(arr[i] < minPrice){
                minPrice = arr[i];
            }
        }

        System.out.println("Maximum Profit is : " + maxProfit);
        System.out.println("Minimum Price is : " + minPrice);
    }
}
