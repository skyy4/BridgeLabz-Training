import java.util.Scanner;

public class OddEvenArr {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // Check if the number is a natural number
        if (n <= 0) {
            System.out.println("Invalid input");
            sc.close();
            return;
        }

        int[] odd = new int[n / 2 + 1];
        int[] even = new int[n / 2 + 1];

        int oi = 0;
        int ei = 0;

        // Store odd and even numbers into respective arrays
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                even[ei] = i;
                ei++;
            } else {
                odd[oi] = i;
                oi++;
            }
        }

        // Print odd numbers
        for (int i = 0; i < oi; i++) {
            System.out.println(odd[i]);
        }

        // Print even numbers
        for (int i = 0; i < ei; i++) {
            System.out.println(even[i]);
        }

        sc.close();
    }
}