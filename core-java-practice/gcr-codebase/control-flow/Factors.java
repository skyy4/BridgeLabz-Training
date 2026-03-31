import java.util.Scanner;

public class Factors {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // Check if the number is a positive integer
        if (n > 0) {

            // Find and print all factors of the number
            for (int i = 1; i < n; i++) {

                // Check if the number is divisible by i
                if (n % i == 0) {
                    System.out.println(i);
                }
            }

        } else {
            System.out.println("The number is not a positive integer");
        }

        sc.close();
    }
}