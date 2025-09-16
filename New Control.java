public class ControlExample {
    public static void main(String[] args) {
        int marks = 45;
        String month = "December";
        int num = 1;

        // If-Else Example
        System.out.println("--- If-Else Statements ---");
        if (marks >= 90) {
            System.out.println("Result: Excellent");
        } else if (marks >= 60) {
            System.out.println("Result: Good");
        } else if (marks >= 40) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }

        // For Loop Example
        System.out.println("\n--- For Loop ---");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Square of " + i + " = " + (i * i));
        }

        // While Loop Example
        System.out.println("\n--- While Loop ---");
        while (num <= 3) {
            System.out.println("Counting number: " + num);
            num++;
        }

        // Do-While Loop Example
        System.out.println("\n--- Do-While Loop ---");
        int dow = 5;
        do {
            System.out.println("Value of dow = " + dow);
            dow--;
        } while (dow > 2);

        // Switch Statement Example
        System.out.println("\n--- Switch Statement ---");
        switch (month) {
            case "January":
                System.out.println("First month of the year.");
                break;
            case "June":
                System.out.println("It's summer time.");
                break;
            case "December":
                System.out.println("It's winter season.");
                break;
            default:
                System.out.println("It's another month.");
        }
    }
}