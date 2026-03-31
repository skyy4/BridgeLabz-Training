import java.util.Scanner;

public class AbundantNum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        // Add all proper divisors of the number
        for (int i = 1; i < n; i++) {

            // Check if i is a divisor of the number
            if (n % i == 0) {
                sum = sum + i;
            }
        }

        // Check if sum of divisors is greater than the number
        if (sum > n) {
            System.out.println("Abundant Number");
        } else {
            System.out.println("Not an Abundant Number");
        }

        sc.close();
    }
}