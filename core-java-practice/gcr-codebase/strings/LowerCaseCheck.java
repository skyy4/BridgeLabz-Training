import java.util.Scanner;

public class LowerCaseCheck {

    // Convert text to lowercase using charAt() and ASCII logic
    public static String toLowerManual(String txt) {

        String res = "";

        for (int i = 0; i < txt.length(); i++) {

            char ch = txt.charAt(i);

            // Convert uppercase character to lowercase
            if (ch >= 'A' && ch <= 'Z') {
                res = res + (char) (ch + 32);
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

        String low1 = toLowerManual(txt);
        String low2 = txt.toLowerCase();

        boolean same = cmpStr(low1, low2);

        System.out.println("Lowercase using charAt(): " + low1);
        System.out.println("Lowercase using toLowerCase(): " + low2);
        System.out.println("Both results are equal: " + same);

        sc.close();
    }
}