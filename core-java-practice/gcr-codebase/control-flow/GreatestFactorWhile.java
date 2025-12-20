import java.util.Scanner;

public class GreatestFactorWhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int gtf = 1;
        int cnt = n - 1;

        // Check if the number is a positive integer greater than 1
        if (n > 1) {

            // Find the greatest factor other than the number itself
            while (cnt >= 1) {

                // Check if the number is divisible by the counter
                if (n % cnt == 0) {
                    gtf = cnt;
                    break;
                }

                cnt--;
            }

            System.out.println(gtf);

        } else {
            System.out.println("The number is not a valid input");
        }

        sc.close();
    }
}