import java.util.Scanner;

public class GreatestFactor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int gtf = 1;

        // Check if the number is a positive integer
        if (n > 1) {

            // Find the greatest factor other than the number itself
            for (int i = n - 1; i >= 1; i--) {

                // Check if the number is divisible by i
                if (n % i == 0) {
                    gtf = i;
                    break;
                }
            }

            System.out.println(gtf);

        } else {
            System.out.println("The number is not a valid input");
        }

        sc.close();
    }
}