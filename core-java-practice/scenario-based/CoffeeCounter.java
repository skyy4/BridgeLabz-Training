import java.util.Scanner;

public class CoffeeCounter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final double gst = 0.18; // 18% GST

        while (true) {

            System.out.print("\nEnter coffee type (Espresso/Latte/Cappuccino) or 'exit': ");
            String coffeeType = sc.nextLine();

            // Exit condition
            if (coffeeType.equalsIgnoreCase("exit")) {
                System.out.println("Cafe closed. Thank you!");
                break;
            }

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine(); // clear buffer

            double price = 0;

            // Select coffee price
            switch (coffeeType.toLowerCase()) {
                case "espresso":
                    price = 120;
                    break;
                case "latte":
                    price = 150;
                    break;
                case "cappuccino":
                    price = 180;
                    break;
                default:
                    System.out.println("Invalid coffee type!");
                    continue; // skip this order
            }

            // Bill calculation
            double totalP = price * quantity;
            double gstAmount = totalP * gst;
            double finalBill = totalP + gstAmount;

            System.out.println("Total Bill (including GST): ₹" + finalBill);
        }

        sc.close();
    }
}