import java.util.Scanner;

public class QuadraticEquation {

    // This method takes three parameter and calculates quadratic equation
    public static void quadraticComputation(double a, double b, double c) {
        double result1; // to hold result for root 1
        double result2; // to hold result for root 2

        double sqrt = Math.sqrt((b * b) - (4 * a * c));
        result1 = (-b + sqrt) / (2 * a);
        result2 = (-b - sqrt) / (2 * a);
        System.out.println("Root 1 is " + result1);
        System.out.println("Root 2 is " + result2);
    }

    // main method
    public static void main(String[] args) {
        // Scanner object
        Scanner userInput = new Scanner(System.in);
        // Prompt user for first input
        System.out.println("Please enter the first number for 'a'");
        // Store user input
        int num1 = userInput.nextInt();
        // Prompt user for second input
        System.out.println("Please enter the second number for 'b'");
        // Store user input
        int num2 = userInput.nextInt();
        // Prompt user for third input
        System.out.println("Please enter the third number for 'c'");
        // Store user input
        int num3 = userInput.nextInt();
        // Invoking quadraticComputation() to perform the calculation
        quadraticComputation(num1, num2, num3);
    }
}
