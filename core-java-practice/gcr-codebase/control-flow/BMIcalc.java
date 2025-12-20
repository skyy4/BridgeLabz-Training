import java.util.Scanner;

public class BMIcalc {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double wt = sc.nextDouble();
        double htCm = sc.nextDouble();

        double ht = htCm / 100.0;
        double bmi = wt / (ht * ht);

        // Check BMI category based on given ranges
        if (bmi <= 18.4) {
            System.out.println("BMI: " + bmi);
            System.out.println("Status: Underweight");
        } else if (bmi <= 24.9) {
            System.out.println("BMI: " + bmi);
            System.out.println("Status: Normal");
        } else if (bmi <= 39.9) {
            System.out.println("BMI: " + bmi);
            System.out.println("Status: Overweight");
        } else {
            System.out.println("BMI: " + bmi);
            System.out.println("Status: Obese");
        }

        sc.close();
    }
}