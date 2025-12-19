import java.util.Scanner;

public class SquarePerimeter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter the perimeter of the square = ");
        double p = sc.nextDouble();

        double side = p / 4;

        System.out.println(
            "The length of the side is " + side +
            " whose perimeter is " + p
        );

        sc.close();
    }
}
