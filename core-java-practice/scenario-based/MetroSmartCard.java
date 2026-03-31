import java.util.Scanner;

public class MetroSmartCard {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = sc.nextDouble(); // initial smart card balance

        while (true) {

            // Exit condition
            if (balance <= 0) {
                System.out.println("Balance exhausted");
                break;
            }

            int dist = sc.nextInt(); // distance in km

            // Special code to quit
            if (dist == -1) {
                break;
            }

            // Fare calculation using ternary operator
            double fare = (dist <= 5) ? 10 :
                          (dist <= 15) ? 20 :
                          30;

            // Check if balance is sufficient
            if (balance < fare) {
                System.out.println("Insufficient balance");
                break;
            }

            // Deduct fare
            balance = balance - fare;

            System.out.println("Fare deducted = " + fare);
            System.out.println("Remaining balance = " + balance);
        }

        sc.close();
    }
}
