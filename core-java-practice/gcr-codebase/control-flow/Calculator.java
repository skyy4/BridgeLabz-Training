import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double first = sc.nextDouble();
        double second = sc.nextDouble();
        String op = sc.next();

        double res = 0.0;

        // Perform operation based on operator using switch case
        switch (op) {

            case "+":
                res = first + second;
                System.out.println(res);
                break;

            case "-":
                res = first - second;
                System.out.println(res);
                break;

            case "*":
                res = first * second;
                System.out.println(res);
                break;

            case "/":
                res = first / second;
                System.out.println(res);
                break;

            default:
                System.out.println("Invalid Operator");
        }

        sc.close();
    }
}