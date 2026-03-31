import java.util.Scanner;

public class LibFine {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tot = 0;

        for (int i = 1; i <= 5; i++) {

            int due = sc.nextInt();     // due date (day)
            int ret = sc.nextInt();     // return date (day)

            // Calculate fine if returned late
            if (ret > due) {
                int late = ret - due;
                int fine = late * 5;
                tot = tot + fine;
                System.out.println("Fine for book " + i + " = " + fine);
            } else {
                System.out.println("No fine for book " + i);
            }
        }

        System.out.println("Total fine = " + tot);

        sc.close();
    }
}