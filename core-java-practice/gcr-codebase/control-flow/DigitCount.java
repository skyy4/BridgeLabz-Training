import java.util.Scanner;

public class DigitCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;

        // Count digits by removing last digit in each iteration
        while (n != 0) {
            n = n / 10;
            cnt++;
        }

        System.out.println(cnt);

        sc.close();
    }
}