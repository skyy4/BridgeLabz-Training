import java.util.Scanner;

public class FriendsCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ageA = sc.nextInt();
        int ageB = sc.nextInt();
        int ageC = sc.nextInt();

        double htA = sc.nextDouble();
        double htB = sc.nextDouble();
        double htC = sc.nextDouble();

        // Check who is the youngest based on age
        if (ageA <= ageB && ageA <= ageC) {
            System.out.println("Amar is the youngest");
        } else if (ageB <= ageA && ageB <= ageC) {
            System.out.println("Akbar is the youngest");
        } else {
            System.out.println("Anthony is the youngest");
        }

        // Check who is the tallest based on height
        if (htA >= htB && htA >= htC) {
            System.out.println("Amar is the tallest");
        } else if (htB >= htA && htB >= htC) {
            System.out.println("Akbar is the tallest");
        } else {
            System.out.println("Anthony is the tallest");
        }

        sc.close();
    }
}