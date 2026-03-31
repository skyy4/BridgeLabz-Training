import java.util.Scanner;

public class BMICalc2D {

    // Find BMI value and status for one person
    public static String[] findBMI(double wt, double htCm) {

        double ht = htCm / 100.0;
        double bmi = wt / (ht * ht);

        String status;

        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        return new String[]{
            String.valueOf(wt),
            String.valueOf(htCm),
            String.valueOf(Math.round(bmi * 100.0) / 100.0),
            status
        };
    }

    // Compute BMI and status for all persons
    public static String[][] computeAll(double[][] data) {

        String[][] res = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {
            res[i] = findBMI(data[i][0], data[i][1]);
        }

        return res;
    }

    // Display result in tabular format
    public static void show(String[][] arr) {

        System.out.println("Weight\tHeight\tBMI\tStatus");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(
                arr[i][0] + "\t" +
                arr[i][1] + "\t" +
                arr[i][2] + "\t" +
                arr[i][3]
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] data = new double[10][2]; // [][0]=weight, [][1]=height

        for (int i = 0; i < 10; i++) {
            data[i][0] = sc.nextDouble();
            data[i][1] = sc.nextDouble();
        }

        String[][] result = computeAll(data);

        show(result);

        sc.close();
    }
}