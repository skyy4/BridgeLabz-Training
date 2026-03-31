import java.util.Scanner;

public class BMIarr {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[] wt = new double[n];
        double[] ht = new double[n];
        double[] bmi = new double[n];
        String[] stat = new String[n];

        for (int i = 0; i < n; i++) {
            wt[i] = sc.nextDouble();
            ht[i] = sc.nextDouble();
        }

        // Calculate BMI and determine weight status
        for (int i = 0; i < n; i++) {

            double h = ht[i] / 100.0;
            bmi[i] = wt[i] / (h * h);

            if (bmi[i] <= 18.4) {
                stat[i] = "Underweight";
            } else if (bmi[i] <= 24.9) {
                stat[i] = "Normal";
            } else if (bmi[i] <= 39.9) {
                stat[i] = "Overweight";
            } else {
                stat[i] = "Obese";
            }
        }

        // Display height, weight, BMI, and status
        for (int i = 0; i < n; i++) {
            System.out.println(
                "Height: " + ht[i] +
                " Weight: " + wt[i] +
                " BMI: " + bmi[i] +
                " Status: " + stat[i]
            );
        }

        sc.close();
    }
}