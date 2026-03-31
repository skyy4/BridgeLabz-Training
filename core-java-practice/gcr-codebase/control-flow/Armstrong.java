import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int org = n;
        int sum = 0;

        // Extract digits and add cube of each digit to sum
        while (org != 0) {

            int dig = org % 10;
            sum = sum + (dig * dig * dig);

            org = org / 10;
        }

        // Check if the sum of cubes equals the original number
        if (sum == n) {
            System.out.println("The number is an Armstrong number");
        } else {
            System.out.println("The number is not an Armstrong number");
        }

        sc.close();
    }
}