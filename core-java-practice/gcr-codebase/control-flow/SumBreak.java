import java.util.Scanner;

public class SumBreak {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double total = 0.0;

        // Stop the loop when user enters 0 or a negative number
        while (true) {

            double num = sc.nextDouble();

            // Check for loop termination condition
            if (num <= 0) {
                break;
            }

            total = total + num;
        }

        System.out.println(total);

        sc.close();
    }
}