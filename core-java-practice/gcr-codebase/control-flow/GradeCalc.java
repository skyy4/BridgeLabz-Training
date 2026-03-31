import java.util.Scanner;

public class GradeCalc {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int phy = sc.nextInt();
        int chem = sc.nextInt();
        int math = sc.nextInt();

        int total = phy + chem + math;
        double avg = total / 3.0;

        char grd;
        String rem;

        // Decide grade and remarks based on average percentage
        if (avg >= 80) {
            grd = 'A';
            rem = "Level 4, above agency-normalized standards";
        } else if (avg >= 70) {
            grd = 'B';
            rem = "Level 3, at agency-normalized standards";
        } else if (avg >= 60) {
            grd = 'C';
            rem = "Level 2, below but approaching agency-normalized standards";
        } else if (avg >= 50) {
            grd = 'D';
            rem = "Level 1, well below agency-normalized standards";
        } else if (avg >= 40) {
            grd = 'E';
            rem = "Level 1-, too below agency-normalized standards";
        } else {
            grd = 'R';
            rem = "Remedial standards";
        }

        System.out.println("Average Mark: " + avg);
        System.out.println("Grade: " + grd);
        System.out.println("Remarks: " + rem);

        sc.close();
    }
}