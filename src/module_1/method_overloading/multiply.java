package module_1.method_overloading;

public class multiply {
    static int multiply(int a, int b){
        return a * b;
    }

    static int multiply(int a, int b, int c){
        return a * b * c;
    }

    static double multiply(double a, double b){
        return a * b;
    }

    public static void main(String[] args) {

        System.out.println(multiply(20, 30));
        System.out.println(multiply(10, 20, 30));
        System.out.println(multiply(1.5, 1.5));
    }
}
