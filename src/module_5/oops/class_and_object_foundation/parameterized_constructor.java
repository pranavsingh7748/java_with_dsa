package module_5.oops.class_and_object_foundation;

public class parameterized_constructor {

        public static class Car {
            String name;
            int price;

             Car(String n, int p) {
                name = n;
                price = p;
            }
        }

        public static void main(String[] args) {

             Car c1 = new Car("BMW", 10000000);
            Car c2 = new Car("Audi", 3000000);

             System.out.println("Car 1 Name: " + c1.name);
            System.out.println("Car 1 Price: " + c1.price);

             System.out.println("Car 2 Name: " + c2.name);
            System.out.println("Car 2 Price: " + c2.price);
        }

}
