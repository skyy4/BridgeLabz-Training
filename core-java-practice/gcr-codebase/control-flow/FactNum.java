import java.util.Scanner;

public class FactNum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long fact = 1;
        int i = 1;

        // Check if the number is a positive integer
        if (n > 0) {

            // Compute factorial using while loop
            while (i <= n) {
                fact = fact * i;
                i++;
            }

            System.out.println(fact);

        } else {
            System.out.println("The number is not a positive integer");
        }

        sc.close();
    }
}