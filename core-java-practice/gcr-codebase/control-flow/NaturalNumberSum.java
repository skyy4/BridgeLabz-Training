import java.util.Scanner;

public class NaturalNumberSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int sum = 0;

        //  check whether the given num is a natural num
        if (num > 0) {

            //  calculate the sum of first n natural numbers
            sum = num * (num + 1) / 2;

            System.out.println(
                "The sum of " + num + " natural numbers is " + sum
            );

        } else {

            System.out.println(
                "The num " + num + " is not a natural num"
            );
        }

        sc.close();
    }
}