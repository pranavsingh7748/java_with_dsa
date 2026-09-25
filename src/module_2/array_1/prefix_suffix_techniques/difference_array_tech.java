package module_2.array_1.prefix_suffix_techniques;

import  java.util.*;

public class difference_array_tech {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] diff = new int[n + 1];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int L = sc.nextInt();
        int R = sc.nextInt();
        int X = sc.nextInt();

        diff[L] += X;
        diff[R + 1] -= X;

        int current = 0;

        for(int i = 0; i < n; i++){
            current += diff[i];
            arr[i] += current;

        }

        for(int i = 0; i < n; i++){
            System.out.println(arr[i] + " ");
        }

        sc.close();
    }
}
