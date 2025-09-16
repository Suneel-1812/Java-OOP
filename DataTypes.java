public class DataTypesDemo {
    public static void main(String[] args) {
        // Integer types
        byte age = 25;             // -128 to 127
        short year = 2025;         // -32,768 to 32,767
        int population = 1_400_000_000; // Commonly used integer type
        long distance = 150_000_000_000L; // Long literal with 'L'

        System.out.println("Integer Types:");
        System.out.println("byte (age): " + age);
        System.out.println("short (year): " + year);
        System.out.println("int (population): " + population);
        System.out.println("long (distance): " + distance);

        // Floating-point types
        float pi = 3.14f;           // Float literal with 'f'
        double e = 2.7182818284;    // Default for decimals

        System.out.println("\nFloating-Point Types:");
        System.out.println("float (pi): " + pi);
        System.out.println("double (e): " + e);

        // Character type
        char grade = 'B';
        System.out.println("\nCharacter Type:");
        System.out.println("char (grade): " + grade);

        // Boolean type
        boolean isJavaFun = true;
        System.out.println("\nBoolean Type:");
        System.out.println("boolean (isJavaFun): " + isJavaFun);
    }
}