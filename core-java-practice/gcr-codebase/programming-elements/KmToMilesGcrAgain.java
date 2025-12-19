import java.util.*;

public class KmToMilesGcrAgain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter distance in km: ");
        double km = sc.nextDouble();

        double miles = km * 0.621371;

        System.out.println(km + " kilometers is equal to " + miles + " miles");

        sc.close();
    }
}