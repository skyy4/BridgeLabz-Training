import java.util.Scanner;

public class PowerNum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int p = sc.nextInt();

        int res = 1;

        // Check if both number and power are positive integers
        if (n > 0 && p > 0) {

            // Compute power using for loop
            for (int i = 1; i <= p; i++) {
                res = res * n;
            }

            System.out.println(res);

        } else {
            System.out.println("Invalid input");
        }

        sc.close();
    }
}