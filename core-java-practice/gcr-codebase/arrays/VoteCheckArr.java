import java.util.Scanner;

public class VoteCheckArr {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] age = new int[10];

        for (int i = 0; i < age.length; i++) {
            age[i] = sc.nextInt();
        }

        for (int i = 0; i < age.length; i++) {

            // Check for invalid (negative) age
            if (age[i] < 0) {
                System.out.println("Invalid age");
            }
            // Check if the student can vote
            else if (age[i] >= 18) {
                System.out.println("The student with the age " + age[i] + " can vote");
            }
            // Student cannot vote
            else {
                System.out.println("The student with the age " + age[i] + " cannot vote");
            }
        }

        sc.close();
    }
}