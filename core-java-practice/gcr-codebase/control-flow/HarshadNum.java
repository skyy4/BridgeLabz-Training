import java.util.Scanner;

public class HarshadNum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int org = n;
        int sum = 0;

        // Find sum of digits
        while (org != 0) {
            int dig = org % 10;
            sum = sum + dig;
            org = org / 10;
        }

        // Check if number is divisible by sum of its digits
        if (sum != 0 && n % sum == 0) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not a Harshad Number");
        }

        sc.close();
    }
}