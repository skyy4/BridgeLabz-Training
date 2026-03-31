import java.util.Scanner;

public class MulTableRange {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] res = new int[4];

        // Store multiplication results from 6 to 9
        for (int i = 6; i <= 9; i++) {
            res[i - 6] = n * i;
        }

        // Display multiplication table using stored values
        for (int i = 6; i <= 9; i++) {
            System.out.println(n + " * " + i + " = " + res[i - 6]);
        }

        sc.close();
    }
}