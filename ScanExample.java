public class ScanExample {
    public static void main(String[] args) {
        String task = "multiply";
        int firstNum = 12;
        double secondNum = 4.5;

        System.out.println("Task: " + task);
        System.out.println("First Number: " + firstNum);
        System.out.println("Second Number: " + secondNum);

        // Example operation based on hardcoded values
        if (task.equals("multiply")) {
            System.out.println("Result of multiplication: " + (firstNum * secondNum));
        }
    }
}