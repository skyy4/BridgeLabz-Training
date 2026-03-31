import java.util.Scanner;

public class ReverseNumArr {

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
        int[] rev = new int[cnt];

        tmp = n;
        int idx = 0;

        // Store digits of the number in array
        while (tmp != 0) {
            dig[idx] = tmp % 10;
            tmp = tmp / 10;
            idx++;
        }

        // Store digits in reverse order
        for (int i = 0; i < cnt; i++) {
            rev[i] = dig[cnt - 1 - i];
        }

        // Display reversed number using array
        for (int i = 0; i < cnt; i++) {
            System.out.print(rev[i]);
        }

        sc.close();
    }
}