public class ScoreAnalyzer {

    // Check score range
    public static void chk(int[] arr) {
        for (int n : arr) {
            if (n < 0 || n > 100) {
                throw new IllegalArgumentException("Invalid score: " + n);
            }
        }
    }

    // Calculate average
    public static double avg(int[] arr) {
        int sum = 0;
        for (int n : arr) {
            sum += n;
        }
        return (double) sum / arr.length;
    }

    // Find max score
    public static int max(int[] arr) {
        int m = arr[0];
        for (int n : arr) {
            if (n > m) {
                m = n;
            }
        }
        return m;
    }

    // Find min score
    public static int min(int[] arr) {
        int m = arr[0];
        for (int n : arr) {
            if (n < m) {
                m = n;
            }
        }
        return m;
    }

    public static void main(String[] args) {

        int[] sc = {78, 85, 90, 66, 88};

        try {
            chk(sc);
            System.out.println("Average = " + avg(sc));
            System.out.println("Highest = " + max(sc));
            System.out.println("Lowest = " + min(sc));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

