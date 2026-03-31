import java.util.Scanner;

public class UpperCaseCheck {

    // Convert text to uppercase using charAt() and ASCII logic
    public static String toUpperManual(String txt) {

        String res = "";

        for (int i = 0; i < txt.length(); i++) {

            char ch = txt.charAt(i);

            // Convert lowercase character to uppercase
            if (ch >= 'a' && ch <= 'z') {
                res = res + (char) (ch - 32);
            } else {
                res = res + ch;
            }
        }

        return res;
    }

    // Compare two strings using charAt()
    public static boolean cmpStr(String a, String b) {

        if (a.length() != b.length()) {
            return false;
        }

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String txt = sc.nextLine();

        String up1 = toUpperManual(txt);
        String up2 = txt.toUpperCase();

        boolean same = cmpStr(up1, up2);

        System.out.println("Uppercase using charAt(): " + up1);
        System.out.println("Uppercase using toUpperCase(): " + up2);
        System.out.println("Both results are equal: " + same);

        sc.close();
    }
}