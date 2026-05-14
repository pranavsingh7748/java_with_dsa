// change the data

package module_2.array_1;

public class array2 {
    public static void main (String[] args){

        int [] arr = new int[5];
        arr[0] = 32;
        arr[1] = 49;
        arr[2] = 89;
        arr[3] = 55;
        arr[4] = 94;

        int[] two = arr;
        arr[2] = 5457;


         for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
