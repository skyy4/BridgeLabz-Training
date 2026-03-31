import java.util.Scanner;

public class TempConv {

    // Fahrenheit to Celsius
    public static double f2c(double f) {
        return (f - 32) * 5 / 9;
    }

    // Celsius to Fahrenheit
    public static double c2f(double c) {
        return (c * 9 / 5) + 32;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ch = sc.nextInt();   // 1 -> F to C, 2 -> C to F
        double n = sc.nextDouble();

        if (ch == 1) {
            System.out.println(f2c(n));
        } else if (ch == 2) {
            System.out.println(c2f(n));
        }

        sc.close();
    }
}