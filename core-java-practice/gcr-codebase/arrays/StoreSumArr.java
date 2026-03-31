import java.util.Scanner;

public class StoreSumArr {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] arr = new double[10];
        double total = 0.0;
        int idx = 0;

        // Read values until 0/negative is entered or array is full
        while (true) {

            double num = sc.nextDouble();

            // Stop input on 0 or negative number
            if (num <= 0) {
                break;
            }

            // Stop input when array reaches its limit
            if (idx == 10) {
                break;
            }

            arr[idx] = num;
            idx++;
        }

        // Add all stored values and display them
        for (int i = 0; i < idx; i++) {
            System.out.println(arr[i]);
            total = total + arr[i];
        }

        System.out.println("Sum = " + total);

        sc.close();
    }
}