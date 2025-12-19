import java.util.Scanner;

public class FindDistance {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter distance in ft =  ");
        double dInFt = sc.nextDouble();

        double dInYards = dInFt / 3;
        double dInMiles = dInYards / 1760;

        System.out.println(
            "Distance in feet is " + dInFt +
            " while in yards is " + dInYards +
            " and miles is " + dInMiles
        );

        sc.close();
    }
}