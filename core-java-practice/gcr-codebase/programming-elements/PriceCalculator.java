import java.util.Scanner;

public class PriceCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter unit price ");
        double uPrice = sc.nextDouble();

        System.out.print("enter q =  ");
        int q = sc.nextInt();

        double total = uPrice * q;

        System.out.println(
            "The total purchase price is INR " + total +
            " if the q " + q +
            " and unit price is INR " + uPrice
        );

        sc.close();
    }
}