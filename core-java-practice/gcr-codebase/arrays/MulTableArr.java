import java.util.Scanner;

public class MulTableArr {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] tab = new int[10];

        // Store multiplication results from 1 to 10
        for (int i = 1; i <= 10; i++) {
            tab[i - 1] = n * i;
        }

        // Display multiplication table using stored values
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + tab[i - 1]);
        }

        sc.close();
    }
}