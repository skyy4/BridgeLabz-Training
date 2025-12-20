import java.util.Scanner;

 public class VotingEligibility {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        boolean canVote = false;

        //  check if the person is eligible to vote
        if (age >= 18) {
            canVote = true;
        }

        if (canVote) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }

        sc.close();
    }
}