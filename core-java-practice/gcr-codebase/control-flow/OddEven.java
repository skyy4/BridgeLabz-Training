import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // Check if the number is a natural number
        if (n > 0) {

            // Iterate from 1 to the given number
            for (int i = 1; i <= n; i++) {

                // Check if the number is even or odd
                if (i % 2 == 0) {
                    System.out.println(i + " is even");
                } else {
                    System.out.println(i + " is odd");
                }
            }

        } else {
            System.out.println("The number is not a natural number");
        }

        sc.close();
    }
}