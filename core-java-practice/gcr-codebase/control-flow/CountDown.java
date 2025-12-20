import java.util.Scanner;

public class CountDown {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();

        // Continue countdown until the counter reaches 1
        for (int i = cnt; i >= 1; i--) {
            System.out.println(i);
        }

        sc.close();
    }
}