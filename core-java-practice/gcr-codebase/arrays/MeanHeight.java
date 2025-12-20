import java.util.Scanner;

public class MeanHeight {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] ht = new double[11];
        double sum = 0.0;

        for (int i = 0; i < ht.length; i++) {
            ht[i] = sc.nextDouble();
        }

        // Add all heights to find total sum
        for (int i = 0; i < ht.length; i++) {
            sum = sum + ht[i];
        }

        double mean = sum / ht.length;

        System.out.println("Mean height = " + mean);

        sc.close();
    }
}