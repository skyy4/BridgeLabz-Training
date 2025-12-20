import java.util.Scanner;

public class ZaraBonus {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] sal = new double[10];
        double[] yrs = new double[10];
        double[] bonus = new double[10];
        double[] newSal = new double[10];

        double totBonus = 0.0;
        double totOld = 0.0;
        double totNew = 0.0;

        // Take valid input for salary and years of service
        for (int i = 0; i < 10; i++) {

            double s = sc.nextDouble();
            double y = sc.nextDouble();

            // Check for invalid salary or years of service
            if (s <= 0 || y < 0) {
                i--;
                continue;
            }

            sal[i] = s;
            yrs[i] = y;
        }

        // Calculate bonus, new salary, and totals
        for (int i = 0; i < 10; i++) {

            if (yrs[i] > 5) {
                bonus[i] = sal[i] * 0.05;
            } else {
                bonus[i] = sal[i] * 0.02;
            }

            newSal[i] = sal[i] + bonus[i];

            totBonus = totBonus + bonus[i];
            totOld = totOld + sal[i];
            totNew = totNew + newSal[i];
        }

        System.out.println("Total Bonus Payout = " + totBonus);
        System.out.println("Total Old Salary = " + totOld);
        System.out.println("Total New Salary = " + totNew);

        sc.close();
    }
}