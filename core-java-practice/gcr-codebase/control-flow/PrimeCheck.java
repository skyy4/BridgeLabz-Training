import java.util.Scanner;

public class PrimeCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        boolean isPrime = true;

        // Check if the number is greater than 1
        if (n > 1) {

            // Check divisibility from 2 to n - 1
            for (int i = 2; i < n; i++) {

                // Check if the number is divisible by any value
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println("The number is a prime number");
            } else {
                System.out.println("The number is not a prime number");
            }

        } else {
            System.out.println("The number is not a prime number");
        }

        sc.close();
    }
}