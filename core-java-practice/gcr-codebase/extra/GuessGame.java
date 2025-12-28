import java.util.Scanner;

public class GuessGame {

    // Generate guess between low and high
    public static int gen(int lo, int hi) {
        return lo + (int) (Math.random() * (hi - lo + 1));
    }

    // Get user feedback
    public static char feed(Scanner sc) {
        return sc.next().charAt(0);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int lo = 1;
        int hi = 100;
        char fb;

        while (true) {

            int g = gen(lo, hi);
            System.out.println("Guess: " + g);

            fb = feed(sc); // h = high, l = low, c = correct

            // Update range based on feedback
            if (fb == 'h') {
                hi = g - 1;
            } else if (fb == 'l') {
                lo = g + 1;
            } else if (fb == 'c') {
                System.out.println("Guessed correctly");
                break;
            }
        }

        sc.close();
    }
}