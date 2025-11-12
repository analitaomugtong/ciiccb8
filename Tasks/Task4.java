import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter a string:");

        String abc = scanner.nextLine();
        String reversed = new StringBuilder(abc).reverse().toString();

        if (abc.equals(reversed)){
            System.out.println("The inputted string is a palindrome.");
        } else {
            System.out.println("The inputted string is not a palindrome.");
        }

    }
}
