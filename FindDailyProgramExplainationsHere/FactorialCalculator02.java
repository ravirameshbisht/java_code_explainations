import java.util.Scanner;

public class FactorialCalculator02 {

    // Recursive method to calculate the factorial of a number
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to enter a number
        System.out.print("Enter a non-negative integer to calculate its factorial: ");

        // Reading the user input
        int number = scanner.nextInt();

        // Closing the scanner to avoid resource leaks
        scanner.close();

        // Checking if the entered number is non-negative
        if (number < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            // Calculating and displaying the factorial of the entered number
            int result = factorial(number);
            System.out.println("The factorial of " + number + " is: " + result);
        }
    }
}

