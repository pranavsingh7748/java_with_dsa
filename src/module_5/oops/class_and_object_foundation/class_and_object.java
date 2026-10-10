package module_5.oops.class_and_object_foundation;

public class class_and_object {
    public static class Car{
        String Name;
        int price;
    }

    public static void main(String[] args) {

        Car c1 = new Car();
        c1.Name = "BMW";
        c1.price = 10000000;

        System.out.println(c1.Name);
        System.out.println(c1.price);


        Car c2 = new Car();
        c2.Name = "Audi";
        c2.price = 10000000;

        System.out.println(c2.Name);
        System.out.println(c2.price);


    }
}
