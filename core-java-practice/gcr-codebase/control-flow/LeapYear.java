import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int yr = sc.nextInt();

        boolean isLeap1 = false;
        boolean isLeap2 = false;

        // Check if the year is valid as per Gregorian calendar
        if (yr >= 1582) {

            // Check leap year using multiple if-else conditions
            if (yr % 400 == 0) {
                isLeap1 = true;
            } else if (yr % 100 == 0) {
                isLeap1 = false;
            } else if (yr % 4 == 0) {
                isLeap1 = true;
            } else {
                isLeap1 = false;
            }

            // Check leap year using single if condition with logical operators
            if ((yr % 4 == 0 && yr % 100 != 0) || (yr % 400 == 0)) {
                isLeap2 = true;
            }

            if (isLeap1 && isLeap2) {
                System.out.println("Year is a Leap Year");
            } else {
                System.out.println("Year is not a Leap Year");
            }

        } else {
            System.out.println("Invalid year");
        }

        sc.close();
    }
}