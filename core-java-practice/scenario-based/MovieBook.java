import java.util.Scanner;

public class MovieBook {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            String mv = sc.next();    // movie type
            String st = sc.next();    // seat type
            char sn = sc.next().charAt(0); // snacks y/n

            int amt = 0;

            // Decide base price by movie type
            switch (mv) {
                case "regular":
                    amt = 150;
                    break;
                case "3d":
                    amt = 200;
                    break;
                case "imax":
                    amt = 300;
                    break;
                default:
                    continue;
            }

            // Add seat price
            if (st.equals("gold")) {
                amt += 100;
            } else if (st.equals("silver")) {
                amt += 50;
            } else {
                continue;
            }

            // Add snack cost
            if (sn == 'y') {
                amt += 80;
            }

            System.out.println("Total amount = " + amt);

            char ch = sc.next().charAt(0); // continue or exit
            if (ch == 'n') {
                break;
            }
        }

        sc.close();
    }
}