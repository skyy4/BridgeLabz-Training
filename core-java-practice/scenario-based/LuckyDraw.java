import java.util.Scanner;

public class LuckyDraw {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            int n = sc.nextInt();   // drawn number

            // Exit condition
            if (n == -1) {
                break;
            }

            // Skip invalid input
            if (n <= 0) {
                continue;
            }

            // Check winning condition
            if (n % 3 == 0 && n % 5 == 0) {
                System.out.println("You win a gift");
            } else {
                System.out.println("Better luck next time");
            }
        }

        sc.close();
    }
}