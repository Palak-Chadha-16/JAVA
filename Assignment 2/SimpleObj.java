public class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.name = "Lion";
        a1.age = 5;
        a1.display();

        Animal a2 = new Animal();
        a2.name = "Elephant";
        a2.age = 10;
        a2.display();

        Animal a3 = new Animal();
        a3.name = "Tiger";
        a3.age = 7;
        a3.display();
    }
}

class Animal {
    String name;
    int age;

    void display() {
        System.out.println("Animal Name: " + name);
        System.out.println("Age: " + age);
    }
}