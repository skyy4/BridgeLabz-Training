import java.util.Scanner;

public class CalC {

    // Addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Subtraction
    public static double sub(double a, double b) {
        return a - b;
    }

    // Multiplication
    public static double mul(double a, double b) {
        return a * b;
    }

    // Division
    public static double div(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ch = sc.nextInt();     // 1:+  2:-  3:*  4:/
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();

        if (ch == 1) {
            System.out.println(add(n1, n2));
        } else if (ch == 2) {
            System.out.println(sub(n1, n2));
        } else if (ch == 3) {
            System.out.println(mul(n1, n2));
        } else if (ch == 4) {
            System.out.println(div(n1, n2));
        }

        sc.close();
    }
}