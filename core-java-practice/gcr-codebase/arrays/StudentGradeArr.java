import java.util.Scanner;

public class StudentGradeArr {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] phy = new int[n];
        int[] chem = new int[n];
        int[] math = new int[n];
        double[] per = new double[n];
        char[] grd = new char[n];

        // Take valid marks input for all students
        for (int i = 0; i < n; i++) {

            int p = sc.nextInt();
            int c = sc.nextInt();
            int m = sc.nextInt();

            if (p < 0 || c < 0 || m < 0) {
                i--;
                continue;
            }

            phy[i] = p;
            chem[i] = c;
            math[i] = m;
        }

        // Calculate percentage and grade
        for (int i = 0; i < n; i++) {

            per[i] = (phy[i] + chem[i] + math[i]) / 3.0;

            if (per[i] >= 80) {
                grd[i] = 'A';
            } else if (per[i] >= 70) {
                grd[i] = 'B';
            } else if (per[i] >= 60) {
                grd[i] = 'C';
            } else if (per[i] >= 50) {
                grd[i] = 'D';
            } else if (per[i] >= 40) {
                grd[i] = 'E';
            } else {
                grd[i] = 'R';
            }
        }

        // Display marks, percentage, and grade
        for (int i = 0; i < n; i++) {
            System.out.println(
                "Physics: " + phy[i] +
                " Chemistry: " + chem[i] +
                " Maths: " + math[i] +
                " Percentage: " + per[i] +
                " Grade: " + grd[i]
            );
        }

        sc.close();
    }
}