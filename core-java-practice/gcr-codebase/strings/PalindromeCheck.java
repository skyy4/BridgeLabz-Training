import java.util.Scanner;

public class PalindromeCheck {

    // Logic 1: Iterative comparison using start and end index
    public static boolean isPalIter(String txt) {

        int st = 0;
        int ed = txt.length() - 1;

        while (st < ed) {
            if (txt.charAt(st) != txt.charAt(ed)) {
                return false;
            }
            st++;
            ed--;
        }

        return true;
    }

    // Logic 2: Recursive comparison
    public static boolean isPalRec(String txt, int st, int ed) {

        if (st >= ed) {
            return true;
        }

        if (txt.charAt(st) != txt.charAt(ed)) {
            return false;
        }

        return isPalRec(txt, st + 1, ed - 1);
    }

    // Reverse string using charAt()
    public static char[] revArr(String txt) {

        char[] rev = new char[txt.length()];
        int idx = 0;

        for (int i = txt.length() - 1; i >= 0; i--) {
            rev[idx++] = txt.charAt(i);
        }

        return rev;
    }

    // Logic 3: Compare original and reversed character arrays
    public static boolean isPalArr(String txt) {

        char[] org = txt.toCharArray();
        char[] rev = revArr(txt);

        for (int i = 0; i < org.length; i++) {
            if (org[i] != rev[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String txt = sc.nextLine();

        boolean r1 = isPalIter(txt);
        boolean r2 = isPalRec(txt, 0, txt.length() - 1);
        boolean r3 = isPalArr(txt);

        System.out.println("Palindrome using Iterative Logic: " + r1);
        System.out.println("Palindrome using Recursive Logic: " + r2);
        System.out.println("Palindrome using Array Logic: " + r3);

        sc.close();
    }
}