import java.util.Scanner;

public class ClimbingStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 1) {
            System.out.println(1);
            sc.close();
            return;
        }
        int prev2 = 1;
        int prev1 = 1;
        int ways = 0;
        for (int i = 2; i <= n; i++) {
            ways = prev1 + prev2;
            prev2 = prev1;
            prev1 = ways;
        }
        System.out.println(ways);
        sc.close();
    }
}

