import java.util.Scanner;

public class MonthCalendar {

    // Get month name using array
    public static String getMonthName(int m) {
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return months[m - 1];
    }

    // Check leap year
    public static boolean isLeapYear(int y) {
        return (y % 400 == 0) || (y % 4 == 0 && y % 100 != 0);
    }

    // Get number of days in a month
    public static int getDaysInMonth(int m, int y) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (m == 2 && isLeapYear(y)) {
            return 29;
        }
        return days[m - 1];
    }

    // Get first day of the month using Gregorian calendar formula
    // 0 = Sunday, 1 = Monday, ..., 6 = Saturday
    public static int getFirstDay(int m, int y) {

        int d = 1;

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        return d0;
    }

    // Display calendar
    public static void showCalendar(int m, int y) {

        String monthName = getMonthName(m);
        int days = getDaysInMonth(m, y);
        int firstDay = getFirstDay(m, y);

        System.out.println("\n" + monthName + " " + y);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // First loop for indentation
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Second loop to print days
        for (int d = 1; d <= days; d++) {
            System.out.printf("%3d ", d);

            if ((d + firstDay) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt(); // e.g. 7
        int year = sc.nextInt();  // e.g. 2005

        showCalendar(month, year);

        sc.close();
    }
}