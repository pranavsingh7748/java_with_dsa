// Swap value

package module_2.array_1;

public class array3 {

    public static void swap (int[] arr , int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] =temp;
    }
    public static void main (String[] args){

        int [] arr = new int[5];
        arr[0] = 32;
        arr[1] = 49;
        arr[2] = 89;
        arr[3] = 55;
        arr[4] = 94;

        swap(arr, 0, 4);


         for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
