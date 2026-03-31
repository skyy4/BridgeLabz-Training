import java.util.Scanner;

public class NatSumCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sumLoop = 0;
        int sumFormula = 0;
        int i = 1;

        // Check if the number is a natural number
        if (n > 0) {

            // Compute sum using while loop
            while (i <= n) {
                sumLoop = sumLoop + i;
                i++;
            }

            // Compute sum using formula
            sumFormula = n * (n + 1) / 2;

            // Compare both results
            if (sumLoop == sumFormula) {
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