import java.util.Scanner;

public class LeapYearAgain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int yr = sc.nextInt();

        // Check if the year is valid and satisfies leap year conditions
        if (yr >= 1582 && ((yr % 4 == 0 && yr % 100 != 0) || (yr % 400 == 0))) {
            System.out.println("Year is a Leap Year");
        } else {
            System.out.println("Year is not a Leap Year");
        }

        sc.close();
    }
}