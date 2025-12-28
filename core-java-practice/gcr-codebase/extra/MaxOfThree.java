import java.util.Scanner;

public class MaxOfThree {

    // Get input number
    public static int inp(Scanner sc) {
        return sc.nextInt();
    }

    // Find maximum of three numbers
    public static int max(int a, int b, int c) {

        int m = a;

        if (b > m) {
            m = b;
        }

        if (c > m) {
            m = c;
        }

        return m;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = inp(sc);
        int n2 = inp(sc);
        int n3 = inp(sc);

        int res = max(n1, n2, n3);

        System.out.println("Maximum value is " + res);

        sc.close();
    }
}