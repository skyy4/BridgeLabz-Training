import java.util.Scanner;


 public class DivisibleBy5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        // Declared a boolean variable to store the result
        boolean isDivisible = false;

        // Check if the num is divisible by 5
        if (num % 5 == 0) {
            isDivisible = true;
        }

        System.out.println(
            "Is the num " + num + " divisible by 5? " + isDivisible
        );

        sc.close();
    }
}