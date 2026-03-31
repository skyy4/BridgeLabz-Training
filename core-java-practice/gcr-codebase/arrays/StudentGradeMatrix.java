import java.util.Scanner;

public class StudentGradeMatrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] marks = new int[n][3];   // [][0]=Physics, [][1]=Chemistry, [][2]=Maths
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

            marks[i][0] = p;
            marks[i][1] = c;
            marks[i][2] = m;
        }

        // Calculate percentage and grade using 2D array
        for (int i = 0; i < n; i++) {

            per[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

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
                "Physics: " + marks[i][0] +
                " Chemistry: " + marks[i][1] +
                " Maths: " + marks[i][2] +
                " Percentage: " + per[i] +
                " Grade: " + grd[i]
            );
        }

        sc.close();
    }
}