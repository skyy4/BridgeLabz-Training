import java.util.Scanner;

public class HandShake {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter number of std: ");
        int nOfStd = sc.nextInt();

        int handshakes = (nOfStd * (nOfStd - 1)) / 2;

        System.out.println(
            "the maximum number of possible handshakes is " + handshakes
        );

        sc.close();
    }
}
