public class Main {
    public static void main(String[] args) {
        try {
            Main outerClass = new Main();
            Class<?> c = Class.forName("Main$Vehicle");
            Vehicle v1 = (Vehicle) c.getDeclaredConstructor(Main.class).newInstance(outerClass);
            Vehicle v2 = (Vehicle) c.getDeclaredConstructor(Main.class).newInstance(outerClass);

            v1.name = "Car";
            v1.color = "Red";
            v2.name = "Bike";
            v2.color = "Black";

            System.out.println("Vehicle 1 Details:");
            v1.display();
            System.out.println("\nVehicle 2 Details:");
            v2.display();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    class Vehicle {
        String name;
        String color;

        void display() {
            System.out.println("Vehicle Name: " + name);
            System.out.println("Vehicle Color: " + color);
        }
    }
}