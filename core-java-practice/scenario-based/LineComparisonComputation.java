import java.util.Scanner;

public class LineComparisonComputation {

    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Computation Program");

        Scanner sc = new Scanner(System.in);

        // UC1: Calculate length of a line using Cartesian coordinates
        System.out.print("Enter x1: ");
        int x1 = sc.nextInt();
        System.out.print("Enter y1: ");
        int y1 = sc.nextInt();
        System.out.print("Enter x2: ");
        int x2 = sc.nextInt();
        System.out.print("Enter y2: ");
        int y2 = sc.nextInt();

        double length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Length of Line 1 = " + length1);

        // UC2: Check equality of two lines using equals
        System.out.print("Enter a1: ");
        int a1 = sc.nextInt();
        System.out.print("Enter b1: ");
        int b1 = sc.nextInt();
        System.out.print("Enter a2: ");
        int a2 = sc.nextInt();
        System.out.print("Enter b2: ");
        int b2 = sc.nextInt();

        double length2 = Math.sqrt(Math.pow(a2 - a1, 2) + Math.pow(b2 - b1, 2));
        System.out.println("Length of Line 2 = " + length2);

        if (Double.valueOf(length1).equals(Double.valueOf(length2)))
            System.out.println("Both Lines are Equal");
        else
            System.out.println("Both Lines are Not Equal");

        // UC3: Compare two lines using compareTo
        int cmp = Double.valueOf(length1).compareTo(Double.valueOf(length2));

        if (cmp == 0)
            System.out.println("Line 1 is Equal to Line 2");
        else if (cmp > 0)
            System.out.println("Line 1 is Greater than Line 2");
        else
            System.out.println("Line 1 is Less than Line 2");
    }
}