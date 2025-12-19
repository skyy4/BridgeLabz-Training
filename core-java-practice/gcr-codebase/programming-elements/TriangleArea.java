import java.util.Scanner;

public class TriangleArea {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter b of the triangle in inches =");
        double b = sc.nextDouble();

        System.out.print("enter h of the triangle in inches = ");
        double h = sc.nextDouble();

        double areaIncheSquare = 0.5 * b * h;
        double areaCmSquare = areaIncheSquare * 6.4516;

        System.out.println(
            "Area of the triangle is " + areaIncheSquare +
            " square inches and " + areaCmSquare +
            " square centimeters"
        );

        sc.close();
    }
}
