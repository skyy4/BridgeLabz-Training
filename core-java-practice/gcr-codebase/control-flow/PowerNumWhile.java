import java.util.Scanner;

public class PowerNumWhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int p = sc.nextInt();

        int res = 1;
        int cnt = 0;

        // Check if both number and power are positive integers
        if (n > 0 && p > 0) {

            // Compute power using while loop
            while (cnt < p) {
                res = res * n;
                cnt++;
            }

            System.out.println(res);

        } else {
            System.out.println("Invalid input");
        }

        sc.close();
    }
}