import java.util.Scanner;

public class PlusOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] digits = new int[n];
        for (int i = 0; i < n; i++) {
            digits[i] = sc.nextInt();
        }
        int carry = 1;
        for (int i = n - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            digits[i] = sum % 10;
            carry = sum / 10;
        }
        if (carry > 0) {
            int[] extended = new int[n + 1];
            extended[0] = carry;
            System.arraycopy(digits, 0, extended, 1, n);
            digits = extended;
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < digits.length; i++) {
            if (i > 0) {
                builder.append(" ");
            }
            builder.append(digits[i]);
        }
        System.out.println(builder.toString());
        sc.close();
    }
}

