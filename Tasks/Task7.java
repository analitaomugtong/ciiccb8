import java.util.Scanner;

public class Task7{

    // addition method
    public static double add(double a, double b) {
        return a + b;
    }

    // subtraction method
    public static double subtract(double a, double b) {
        return a - b;
    }

    // multiplication method
    public static double multiply(double a, double b) {
        return a * b;
    }

    // division method
    public static double divide(double a, double b) {
        if (b == 0) {56
            System.out.println("Error: Cannot divide by zero!");
            return 0; 
        }
        return a / b;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        System.out.println("\n--- RESULTS ---");
        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Subtraction: " + subtract(num1, num2));
        System.out.println("Multiplication: " + multiply(num1, num2));
        System.out.println("Division: " + divide(num1, num2));
    }
}