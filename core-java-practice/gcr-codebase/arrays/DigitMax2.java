import java.util.Scanner;

public class DigitMax2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int maxDigit = 10;
        int[] dig = new int[maxDigit];
        int idx = 0;

        // Store all digits of the number into a dynamically growing array
        while (n != 0) {

            // Increase array size when index reaches current limit
            if (idx == maxDigit) {
                maxDigit = maxDigit + 10;
                int[] tmp = new int[maxDigit];

                for (int i = 0; i < idx; i++) {
                    tmp[i] = dig[i];
                }

                dig = tmp;
            }

            dig[idx] = n % 10;
            n = n / 10;
            idx++;
        }

        int max1 = 0;
        int max2 = 0;

        // Find largest and second largest digit
        for (int i = 0; i < idx; i++) {

            if (dig[i] > max1) {
                max2 = max1;
                max1 = dig[i];
            } else if (dig[i] > max2 && dig[i] != max1) {
                max2 = dig[i];
            }
        }

        System.out.println("Largest digit = " + max1);
        System.out.println("Second largest digit = " + max2);

        sc.close();
    }
}