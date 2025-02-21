public class OperatorsExample {
    public static void main(String[] args) {
        int a = 10, b = 5;
        double x = 10.5, y = 4.5;
        boolean p = true, q = false;

        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        System.out.println("\nRelational Operators:");
        System.out.println("a > b  = " + (a > b));
        System.out.println("a < b  = " + (a < b));
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));
        System.out.println("a >= b = " + (a >= b));
        System.out.println("a <= b = " + (a <= b));

        System.out.println("\nLogical Operators:");
        System.out.println("p && q = " + (p && q));
        System.out.println("p || q = " + (p || q));
        System.out.println("!p     = " + (!p));

        System.out.println("\nBitwise Operators:");
        System.out.println("a & b  = " + (a & b)); 
        System.out.println("a | b  = " + (a | b)); 
        System.out.println("a ^ b  = " + (a ^ b)); 
        System.out.println("~a     = " + (~a));    
        System.out.println("a << 1 = " + (a << 1));
        System.out.println("a >> 1 = " + (a >> 1));

        System.out.println("\nAssignment Operators:");
        int c = 10;
        c += 5;
        System.out.println("c += 5  → c = " + c);
        c -= 3;
        System.out.println("c -= 3  → c = " + c);
        c *= 2;
        System.out.println("c *= 2  → c = " + c);
        c /= 4;
        System.out.println("c /= 4  → c = " + c);
        c %= 3;
        System.out.println("c %= 3  → c = " + c);

       
    }
}
