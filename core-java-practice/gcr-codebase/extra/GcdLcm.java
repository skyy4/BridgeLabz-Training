import java.util.Scanner;

public class GcdLcm {

    // Calculate GCD using Euclidean method
    public static int gcd(int a, int b) {

        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }

        return a;
    }

    // Calculate LCM using GCD
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int g = gcd(n1, n2);
        int l = lcm(n1, n2);

        System.out.println("GCD = " + g);
        System.out.println("LCM = " + l);

        sc.close();
    }
}