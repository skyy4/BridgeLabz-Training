import java.util.Scanner;

public class FizzBuzzArr {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // Check if the number is a positive integer
        if (n <= 0) {
            System.out.println("Invalid input");
            sc.close();
            return;
        }

        String[] res = new String[n + 1];

        // Store FizzBuzz results in the array
        for (int i = 0; i <= n; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                res[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                res[i] = "Fizz";
            } else if (i % 5 == 0) {
                res[i] = "Buzz";
            } else {
                res[i] = String.valueOf(i);
            }
        }

        // Display results with position
        for (int i = 0; i <= n; i++) {
            System.out.println("Position " + i + " = " + res[i]);
        }

        sc.close();
    }
}