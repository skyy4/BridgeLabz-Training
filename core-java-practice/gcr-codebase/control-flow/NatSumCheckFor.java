import java.util.Scanner;

public class NatSumCheckFor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sumLoop = 0;
        int sumForm = 0;

        // Check if the number is a natural number
        if (n > 0) {

            // Compute sum using for loop
            for (int i = 1; i <= n; i++) {
                sumLoop = sumLoop + i;
            }

            // Compute sum using formula
            sumForm = n * (n + 1) / 2;

            // Compare both results
            if (sumLoop == sumForm) {
                System.out.println("The result is correct");
            } else {
                System.out.println("The result is not correct");
            }

        } else {
            System.out.println("The number is not a natural number");
        }

        sc.close();
    }
}