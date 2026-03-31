import java.util.Scanner;

public class BmiTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input weight and height
        System.out.print("Enter weight in kg: ");
        double weight = sc.nextDouble();

        System.out.print("Enter height in m: ");
        double height = sc.nextDouble();

        // BMI calculation
        double bmi = weight / (height * height);

        System.out.println("Your BMI is: " + bmi);

        // BMI category check
        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Category: Normal");
        } else {
            System.out.println("Category: Overweight");
        }

        sc.close();
    }
}
