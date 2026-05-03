package module_1.pattern_3;

import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i =1; i <= n; i++){
             for (int j = 1; j <=i; j++){  // is loop ko jitna i milega utna * print kr dega
                 System.out.print("*\t"); // "\t" lagane se thora dur dur print hota h
             }
            System.out.println();
        }
    }
}
