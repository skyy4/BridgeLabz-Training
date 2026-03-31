import java.util.Scanner;

public class ElectionBooth {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int c1 = 0;
        int c2 = 0;
        int c3 = 0;

        while (true) {

            int age = sc.nextInt();

            // Exit condition for stopping the polling
            if (age == -1) {
                break;
            }

            // Check voting eligibility
            if (age < 18) {
                System.out.println("Not eligible to vote");
                continue;
            }

            int vote = sc.nextInt();

            // Record vote based on choice
            if (vote == 1) {
                c1++;
            } else if (vote == 2) {
                c2++;
            } else if (vote == 3) {
                c3++;
            } else {
                System.out.println("Invalid vote");
            }
        }

        System.out.println("Election Results");
        System.out.println("Candidate 1 votes = " + c1);
        System.out.println("Candidate 2 votes = " + c2);
        System.out.println("Candidate 3 votes = " + c3);

        sc.close();
    }
}
