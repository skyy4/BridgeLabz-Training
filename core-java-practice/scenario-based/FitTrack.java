import java.util.Scanner;

public class FitTrack {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] wk = new int[7];

        for (int i = 0; i < 7; i++) {
            wk[i] = sc.nextInt();   // push-ups per day (0 = rest day)
        }

        int tot = 0;
        int cnt = 0;

        for (int n : wk) {

            // Skip rest days
            if (n == 0) {
                continue;
            }

            tot = tot + n;
            cnt++;
        }

        double avg = (cnt > 0) ? (double) tot / cnt : 0;

        System.out.println("Total push-ups = " + tot);
        System.out.println("Average push-ups = " + avg);

        sc.close();
    }
}