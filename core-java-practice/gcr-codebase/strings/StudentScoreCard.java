public class StudentScoreCard {

    // Generate random 2-digit PCM scores for students
    public static int[][] genPCM(int n) {

        int[][] pcm = new int[n][3];

        for (int i = 0; i < n; i++) {
            pcm[i][0] = (int) (Math.random() * 90) + 10; // Physics
            pcm[i][1] = (int) (Math.random() * 90) + 10; // Chemistry
            pcm[i][2] = (int) (Math.random() * 90) + 10; // Maths
        }

        return pcm;
    }

    // Calculate total, average, and percentage
    public static double[][] calcStats(int[][] pcm) {

        int n = pcm.length;
        double[][] stats = new double[n][3]; // total, average, percentage

        for (int i = 0; i < n; i++) {

            double total = pcm[i][0] + pcm[i][1] + pcm[i][2];
            double avg = total / 3.0;
            double per = avg;

            stats[i][0] = Math.round(total * 100.0) / 100.0;
            stats[i][1] = Math.round(avg * 100.0) / 100.0;
            stats[i][2] = Math.round(per * 100.0) / 100.0;
        }

        return stats;
    }

    // Calculate grade based on percentage
    public static char[] calcGrade(double[][] stats) {

        char[] grd = new char[stats.length];

        for (int i = 0; i < stats.length; i++) {

            double p = stats[i][2];

            if (p >= 80) grd[i] = 'A';
            else if (p >= 70) grd[i] = 'B';
            else if (p >= 60) grd[i] = 'C';
            else if (p >= 50) grd[i] = 'D';
            else if (p >= 40) grd[i] = 'E';
            else grd[i] = 'R';
        }

        return grd;
    }

    // Display scorecard in tabular format
    public static void display(int[][] pcm, double[][] stats, char[] grd) {

        System.out.println(
            "Stu\tPhy\tChem\tMath\tTotal\tAvg\tPer\tGrade"
        );

        for (int i = 0; i < pcm.length; i++) {
            System.out.println(
                (i + 1) + "\t" +
                pcm[i][0] + "\t" +
                pcm[i][1] + "\t" +
                pcm[i][2] + "\t" +
                stats[i][0] + "\t" +
                stats[i][1] + "\t" +
                stats[i][2] + "\t" +
                grd[i]
            );
        }
    }

    public static void main(String[] args) {

        int n = 5; // number of students

        int[][] pcm = genPCM(n);
        double[][] stats = calcStats(pcm);
        char[] grd = calcGrade(stats);

        display(pcm, stats, grd);
    }
}