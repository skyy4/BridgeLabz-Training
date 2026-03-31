import java.util.Scanner;

public class NumberSignCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        //  check if the number is positive
        if (num > 0) {
            System.out.println("positive");
        }
        //  check if the number is negative
        else if (num < 0) {
            System.out.println("negative");
        }
        //  check if the number is zero
        else {
            System.out.println("zero");
        }

        sc.close();
    }
}