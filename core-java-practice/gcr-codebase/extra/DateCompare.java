import java.time.LocalDate;
import java.util.Scanner;

public class DateCompare {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LocalDate d1 = LocalDate.parse(sc.nextLine());
        LocalDate d2 = LocalDate.parse(sc.nextLine());

        // Compare the two dates
        if (d1.isBefore(d2)) {
            System.out.println("First date is before second date");
        } else if (d1.isAfter(d2)) {
            System.out.println("First date is after second date");
        } else if (d1.isEqual(d2)) {
            System.out.println("Both dates are equal");
        }

        sc.close();
    }
}