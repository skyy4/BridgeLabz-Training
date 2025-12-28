import java.util.Scanner;

public class BusRoute {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tot = 0;

        while (true) {

            int d = sc.nextInt();   // distance added at each stop
            tot = tot + d;

            char ch = sc.next().charAt(0); // y -> get off, n -> continue

            // Exit when passenger confirms to get off
            if (ch == 'y') {
                break;
            }
        }

        System.out.println("Total distance travelled = " + tot);

        sc.close();
    }
}