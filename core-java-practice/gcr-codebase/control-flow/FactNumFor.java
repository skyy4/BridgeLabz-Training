import java.util.Scanner;

public class FactNumFor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long fact = 1;

        // Check if the number is a natural number
        if (n > 0) {

            // Compute factorial using for loop
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }

            System.out.println(fact);

        } else {
            System.out.println("The number is not a natural number");
        }

        sc.close();
    }
}