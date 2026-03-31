import java.util.Scanner;

public class PalCheck {

    // Take string input
    public static String inp(Scanner sc) {
        return sc.nextLine();
    }

    // Check palindrome condition
    public static boolean pal(String s) {

        int st = 0;
        int ed = s.length() - 1;

        while (st < ed) {
            if (s.charAt(st) != s.charAt(ed)) {
                return false;
            }
            st++;
            ed--;
        }

        return true;
    }

    // Display result
    public static void show(boolean res) {

        if (res) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String txt = inp(sc);
        boolean res = pal(txt);
        show(res);

        sc.close();
    }
}