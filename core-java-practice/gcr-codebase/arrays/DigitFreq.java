import java.util.Scanner;

public class DigitFreq {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int tmp = n;
        int cnt = 0;

        // Count number of digits
        while (tmp != 0) {
            cnt++;
            tmp = tmp / 10;
        }

        int[] dig = new int[cnt];
        int[] freq = new int[10];

        tmp = n;
        int idx = 0;

        // Store digits of the number in array
        while (tmp != 0) {
            dig[idx] = tmp % 10;
            tmp = tmp / 10;
            idx++;
        }

        // Calculate frequency of each digit
        for (int i = 0; i < dig.length; i++) {
            freq[dig[i]]++;
        }

        // Display frequency of each digit
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " occurs " + freq[i] + " times");
            }
        }

        sc.close();
    }
}