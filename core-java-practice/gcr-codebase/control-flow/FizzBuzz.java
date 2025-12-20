import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // Check if the number is a positive integer
        if (n > 0) {

            // Iterate from 1 to the given number
            for (int i = 1; i <= n; i++) {

                // Check for multiples of both 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                // Check for multiples of 3
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
                // Check for multiples of 5
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
                // Print the number if no condition matches
                else {
                    System.out.println(i);
                }
            }

        } else {
            System.out.println("The number is not a positive integer");
        }

        sc.close();
    }
}