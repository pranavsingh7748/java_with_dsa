package module_2.array_1;
import java.util.*;
public class union_of_two_unshoted_array {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n1= sc.nextInt();
        int[] arr1 = new int[n1];

        for(int i = 0; i < n1; i++){
            arr1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];

        for(int i = 0; i < n2; i++){
            arr2[i] = sc.nextInt();
        }

        // first short array
        for(int i = 0; i < n1-1; i++ ){
            for(int j = 0; j < n1 - 1 - i; j++){

                if (arr1[j] > arr1[j+1]){
                    int temp = arr1[j];
                    arr1[j] = arr1[j+1];
                    arr1[j+1] = temp;
                }

            }
        }

        // shot second array

        for(int i = 0; i < n2-1; i++ ){
            for(int j = 0; j < n2 - 1 - i; j++){

                if (arr2[j] > arr2[j+1]){
                    int temp = arr2[j];
                    arr2[j] = arr2[j+1];
                    arr2[j+1] = temp;
                }

            }
        }

        int i = 0;
        int j = 0;
        while (i < n1 && j < n2){
            if (arr1[i] < arr2[j]){
                System.out.print(arr1[i] + " ");
                i++;
            } else if (arr1[i] > arr2[j]) {
                System.out.print(arr2[j] + " ");
                j++;
            } else {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }

        while (i < n1){
            System.out.print(arr1[i] + " ");
            i++;
        }
        while (j < n2){
            System.out.print(arr2[j] + " ");
            j++;
        }

    }
}



