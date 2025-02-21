public class NumberToWord {
    public static void main(String[] args) {
        int a_number = 4;

        System.out.println("Using equality operator:");
        if (a_number == 1) System.out.println("One");
        else if (a_number == 2) System.out.println("Two");
        else if (a_number == 3) System.out.println("Three");
        else if (a_number == 4) System.out.println("Four");
        else if (a_number == 5) System.out.println("Five");
        else System.out.println("Out of range");

        System.out.println("Without using equality operator:");
        switch (a_number) {
            case 1 -> System.out.println("One");
            case 2 -> System.out.println("Two");
            case 3 -> System.out.println("Three");
            case 4 -> System.out.println("Four");
            case 5 -> System.out.println("Five");
            default -> System.out.println("Out of range");
        }
    }
}
