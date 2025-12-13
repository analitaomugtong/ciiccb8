package Task121;

public class DateTask {

    // instance variables (ENCAPSULATED)
    private byte day;
    private byte month;
    private short year;

    // No-args constructor
    public DateTask() {
        this(1, 1, 1);
    }

    // Constructor with arguments
    public DateTask(int m, int d, int y) {
        setDate(m, d, y);
    }

    // Display date in MM/DD/YYYY format
    @Override
    public String toString() {
        return month + "/" + day + "/" + year;
    }

    public void setDate(int m, int d, int y) {
        if (valid(d, m, y)) {
            day = (byte) d;
            month = (byte) m;
            year = (short) y;
        } else {
            day = 0;
            month = 0;
            year = 0;
        }
    }

    // Leap year display
    public static void leapYears() {
        for (int i = 1980; i <= 2023; i++) {
            if (((i % 4 == 0) && (i % 100 != 0)) || (i % 400 == 0)) {
                System.out.println("The year " + i + " is a leap year");
            }
        }
    }

    // Getters
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    // Setters
    public void setDay(int day) {
        if (valid(day, month, year)) {
            this.day = (byte) day;
        } else {
            this.day = 0;
        }
    }

    public void setMonth(int month) {
        if (valid(day, month, year)) {
            this.month = (byte) month;
        } else {
            this.month = 0;
        }
    }

    public void setYear(int year) {
        if (valid(day, month, year)) {
            this.year = (short) year;
        } else {
            this.year = 0;
        }
    }

    // Validation method
    private boolean valid(int day, int month, int year) {
        if (day < 1 || day > 31 || month < 1 || month > 12 || year < 1) {
            System.out.println(
                "Attempting to create a non-valid date " +
                month + "/" + day + "/" + year
            );
            return false;
        }

        switch (month) {
            case 4: case 6: case 9: case 11:
                return day <= 30;
            case 2:
                return day <= 28 || (day == 29 && year % 4 == 0);
        }
        return true;
    }
}
