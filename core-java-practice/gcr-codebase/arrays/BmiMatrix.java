import java.util.Scanner;

public class BmiMatrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[][] personData = new double[n][3]; // [][0]=weight, [][1]=height(cm), [][2]=BMI
        String[] status = new String[n];

        // Take valid input for weight and height
        for (int i = 0; i < n; i++) {

            double wt = sc.nextDouble();
            double ht = sc.nextDouble();

            // Check for invalid (negative or zero) values
            if (wt <= 0 || ht <= 0) {
                i--;
                continue;
            }

            personData[i][0] = wt;
            personData[i][1] = ht;
        }

        // Calculate BMI and determine weight status
        for (int i = 0; i < n; i++) {

            double h = personData[i][1] / 100.0;
            personData[i][2] = personData[i][0] / (h * h);

            if (personData[i][2] <= 18.4) {
                status[i] = "Underweight";
            } else if (personData[i][2] <= 24.9) {
                status[i] = "Normal";
            } else if (personData[i][2] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // Display height, weight, BMI, and status
        for (int i = 0; i < n; i++) {
            System.out.println(
                "Height: " + personData[i][1] +
                " Weight: " + personData[i][0] +
                " BMI: " + personData[i][2] +
                " Status: " + status[i]
            );
        }

        sc.close();
    }
}