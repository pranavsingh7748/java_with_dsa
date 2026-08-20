package module_1.method_overloading;

import javax.xml.transform.Source;

public class add {
    static int add(int a, int b){
        return a + b;
    }

    static double add (double a, double b){
        return a + b;
    }

    static int add (int a, int b, int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(add(5, 5));
        System.out.println(add(5.5, 5.5));
        System.out.println(add(5, 5, 5));
    }
}
