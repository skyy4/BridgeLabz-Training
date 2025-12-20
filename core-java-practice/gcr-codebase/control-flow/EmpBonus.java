import java.util.Scanner;

public class EmpBonus {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double sal = sc.nextDouble();
        int yrs = sc.nextInt();

        double bonus = 0.0;

        // Check if years of service is more than 5
        if (yrs > 5) {
            bonus = sal * 0.05;
        }

        System.out.println(bonus);

        sc.close();
    }
}