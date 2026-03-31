import java.util.Scanner;

public class FriendsArr {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] name = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        double[] ht = new double[3];

        for (int i = 0; i < 3; i++) {
            age[i] = sc.nextInt();
            ht[i] = sc.nextDouble();
        }

        int yIdx = 0;
        int tIdx = 0;

        // Find youngest friend based on age
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[yIdx]) {
                yIdx = i;
            }
        }

        // Find tallest friend based on height
        for (int i = 1; i < 3; i++) {
            if (ht[i] > ht[tIdx]) {
                tIdx = i;
            }
        }

        System.out.println(name[yIdx] + " is the youngest");
        System.out.println(name[tIdx] + " is the tallest");

        sc.close();
    }
}