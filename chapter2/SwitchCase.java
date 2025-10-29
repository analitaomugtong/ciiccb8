package chapter2;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        
        Scanner scanner = new Scanner(System.in);
        String choice;

        do{
                System.out.println("Enter the number of days:"); 
                 int dayOfWeek = scanner.nextInt();
                
        switch(dayOfWeek){
        case 1: System.out.println("Monday");
                break;
        case 2: System.out.println("Tuesday");
                break;
        case 3: System.out.println("Wednesday");
                break;
        case 4: System.out.println("Thursday");
                break;
        case 5: System.out.println("Friday");
                break;
        case 6:
        case 7: System.out.println("Weekends");
                break;
                default: System.out.println("Invalid number of days. Please enter number between 1-7");
        }
            System.out.println("Do you want to enter another day ? (yes/ no)");
            choice = scanner.next();
                
        } while (choice.equalsIgnoreCase("yes"));
       
        scanner.close();
        System.out.println("Thank you for using this simple program. Have a nice day ahead!");
    }
}

