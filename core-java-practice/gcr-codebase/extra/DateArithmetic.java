import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take date input in YYYY-MM-DD format
        String inputDate = sc.nextLine();

        LocalDate date = LocalDate.parse(inputDate);

        // Add 7 days, 1 month, and 2 years
        LocalDate updatedDate = date.plusDays(7)
                                    .plusMonths(1)
                                    .plusYears(2);

        // Subtract 3 weeks
        LocalDate finalDate = updatedDate.minusWeeks(3);

        System.out.println("Original Date : " + date);
        System.out.println("After adding 7 days, 1 month, 2 years : " + updatedDate);
        System.out.println("After subtracting 3 weeks : " + finalDate);

        sc.close();
    }
}