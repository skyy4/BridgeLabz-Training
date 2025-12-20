import java.util.Scanner;


 public class SmallestOf3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        // Variable to store the result of the comparison
        boolean isFirstSmallest = false;

        // Check if the first number is smaller than the other two numbers
        if (num1 < num2 && num1 < num3) {
            isFirstSmallest = true;
        }

        System.out.println(
            "Is the first number the smallest? " + isFirstSmallest
        );

        sc.close();
    }
}