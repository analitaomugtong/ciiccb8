package Task121;

public class MyDate {

    public static void main(String[] args) {

        // Create DateTask objects with required dates
        DateTask date1 = new DateTask(1, 1, 1978);
        DateTask date2 = new DateTask(9, 21, 1984);

        // Display the dates
        System.out.println(date1);
        System.out.println(date2);

        // Display leap years after printing date2
        DateTask.leapYears();
    }
}
