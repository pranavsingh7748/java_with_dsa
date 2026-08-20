package module_1.method_and_function;

public class print_table {

    static void printTable(int n ){
        for(int i = 1; i <= 10; i++){
            System.out.println(n + " * " + i + " = " + ( n * i));
        }

    }

    public static void main(String[] args) {
        printTable(5);
    }
}
