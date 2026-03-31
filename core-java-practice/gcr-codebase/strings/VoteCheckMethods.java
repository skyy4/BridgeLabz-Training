import java.util.Scanner;

public class VoteCheckMethods {

    // Generate random 2-digit ages for n students
    public static int[] genAge(int n) {

        int[] age = new int[n];

        for (int i = 0; i < n; i++) {
            age[i] = (int) (Math.random() * 90) + 10;
        }

        return age;
    }

    // Create 2D array of age and voting eligibility
    public static String[][] chkVote(int[] age) {

        String[][] res = new String[age.length][2];

        for (int i = 0; i < age.length; i++) {

            res[i][0] = String.valueOf(age[i]);

            if (age[i] < 0) {
                res[i][1] = "false";
            } else if (age[i] >= 18) {
                res[i][1] = "true";
            } else {
                res[i][1] = "false";
            }
        }

        return res;
    }

    // Display result in tabular format
    public static void show(String[][] arr) {

        System.out.println("Age\tCan Vote");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + "\t" + arr[i][1]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 10;

        int[] age = genAge(n);
        String[][] res = chkVote(age);

        show(res);

        sc.close();
    }
}