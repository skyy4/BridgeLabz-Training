import java.util.Scanner;

public class HeightConversion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter your height in cm: ");
        double h = sc.nextDouble();

        double inInches = h / 2.54;
        int feet = (int) (inInches / 12);
        double inches = inInches % 12;

        System.out.println("Your Height in cm is " + h +
                           " while in feet is " + feet +
                           " and inches is " + inches);

        sc.close();
    }
}