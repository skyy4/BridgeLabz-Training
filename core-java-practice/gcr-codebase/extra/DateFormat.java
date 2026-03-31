import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormat {

    public static void main(String[] args) {

        LocalDate dt = LocalDate.now();

        // Format date in different patterns
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter f3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        System.out.println(dt.format(f1));
        System.out.println(dt.format(f2));
        System.out.println(dt.format(f3));
    }
}