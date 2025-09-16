public class ArithmeticLogicalOps {
    public static void main(String[] args) {
        // Arithmetic Operations with different numbers
        int num1 = 15;
        int num2 = 4;
        System.out.println("Arithmetic Operations:");
        System.out.println("num1 + num2 = " + (num1 + num2)); // Addition
        System.out.println("num1 - num2 = " + (num1 - num2)); // Subtraction
        System.out.println("num1 * num2 = " + (num1 * num2)); // Multiplication
        System.out.println("num1 / num2 = " + (num1 / num2)); // Division (integer division)
        System.out.println("num1 % num2 = " + (num1 % num2)); // Modulus

        // Logical Operations with different booleans
        boolean p = false;
        boolean q = true;
        System.out.println("\nLogical Operations:");
        System.out.println("p && q = " + (p && q)); // Logical AND
        System.out.println("p || q = " + (p || q)); // Logical OR
        System.out.println("!q = " + (!q));         // Logical NOT
    }
}