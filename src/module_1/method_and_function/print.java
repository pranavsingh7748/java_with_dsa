package module_1.method_and_function;

public class print {
    static  void checkNumber(int n){
        if(n < 0){
            System.out.println("Negative");
            return;
        }
        System.out.println("Void");
    }

    public static void main(String[] args) {
        checkNumber(-20);
        checkNumber(20);
    }

}



