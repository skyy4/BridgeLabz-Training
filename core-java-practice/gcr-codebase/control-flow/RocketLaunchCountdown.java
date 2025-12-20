import java.util.Scanner;

public class RocketLaunchCountdown {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();

        // Continue countdown until the counter reaches 1
        while (cnt >= 1) {
            System.out.println(cnt);
            cnt--;
        }

        sc.close();
    }
}