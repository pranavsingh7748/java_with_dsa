package module_1.method_and_function;

public class find_max {
    static int max (int a, int b){
        if (a > b){
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        int result = max(20, 15);
        System.out.println(result);
    }
}
