// Public class example
public class AccessDemo {

    // Public member: Accessible from anywhere
    public String publicMessage = "Hello, World!";

    // Private member: Accessible only within this class
    private int privatePin = 1234;

    // Protected member: Accessible within the package and subclasses
    protected boolean isActive = true;

    // Default (package-private) member: Accessible only in the same package
    double defaultBalance = 2500.75;

    // Final variable: Constant that cannot be reassigned
    public final int MAX_LIMIT = 100;

    // Method to display all variables
    public void showDetails() {
        System.out.println("--- AccessModifiersSet2 ---");
        System.out.println("Public Message: " + publicMessage);
        System.out.println("Private PIN: " + privatePin);
        System.out.println("Protected Active: " + isActive);
        System.out.println("Default Balance: " + defaultBalance);
        System.out.println("Final Constant MAX_LIMIT: " + MAX_LIMIT);
    }

    public static void main(String[] args) {
        AccessDemo obj = new AccessDemo();
        obj.showDetails();
    }
}