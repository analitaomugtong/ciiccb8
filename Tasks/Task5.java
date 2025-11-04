//check whose largest number in 3 inputs
//write a program that takes in three numbers from the user and putputs the largest numbers. If all numbers are equal it will print "All numbers are equal"

public class Task5 {
    public static void main(String[] args) {
   
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.println("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Enter third number: ");
        double num3 = scanner.nextDouble();

        if (num1 == num2 && num2 == num3){
            System.out.println("All numbers are equal");
        } else {
            if (num1 >= num2 && num1 >= num3){
                System.out.println("The largest number is "+ num1 + ", which is the first number");
            } else if (num2 >= num1 && num2 >= num3) {
                System.out.println("The largest number is "+ num2 + ", which is the second number");
            } else {
                System.out.println("The largest number is "+ num3 + ", which is the third number");
            }
        }

    }

}
