import java.util.Scanner;

public class Multiples {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // Check if the number is positive and less than 100
        if (n > 0 && n < 100) {

            // Traverse backward to find multiples below 100
            for (int i = 100; i >= 1; i--) {

                // Check if i is a multiple of the number
                if (i % n == 0) {
                    System.out.println(i);
                }
            }

        } else {
            System.out.println("Invalid input");
        }

        sc.close();
    }
}