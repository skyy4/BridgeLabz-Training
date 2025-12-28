import java.util.Scanner;

public class FactRec {

    // Take input number
    public static int inp(Scanner sc) {
        return sc.nextInt();
    }

    // Recursive factorial calculation
    public static int fact(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * fact(n - 1);
    }

    // Display result
    public static void show(int n, int res) {
        System.out.println("Factorial of " + n + " is " + res);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = inp(sc);
        int res = fact(n);
        show(n, res);

        sc.close();
    }
}