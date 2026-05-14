package module_2.array_1;

public class array1 {
    public static void main (String[] args){

        int [] arr = new int[5];
        arr[0] = 32;
        arr[1] = 49;
        arr[2] = 89;
        arr[3] = 55;
        arr[4] = 94;


        // System.out.println(arr.length); // this is print only array length
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
