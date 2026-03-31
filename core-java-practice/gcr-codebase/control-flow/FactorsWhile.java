import java.util.Scanner;

public class FactorsWhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int i = 1;

        // Check if the number is a positive integer
        if (n > 0) {

            // Iterate through possible factors using while loop
            while (i < n) {

                // Check if the number is divisible by the counter
                if (n % i == 0) {
                    System.out.println(i);
                }

                i++;
            }

        } else {
            System.out.println("The number is not a positive integer");
        }

        sc.close();
    }
}