import java.util.Scanner;

public class SubStrCompare {

    // Create substring using charAt()
    public static String makeSub(String s, int st, int ed) {

        String res = "";

        for (int i = st; i < ed; i++) {
            res = res + s.charAt(i);
        }

        return res;
    }

    // Compare two strings using charAt()
    public static boolean cmpStr(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String txt = sc.next();
        int st = sc.nextInt();
        int ed = sc.nextInt();

        String sub1 = makeSub(txt, st, ed);
        String sub2 = txt.substring(st, ed);

        boolean same = cmpStr(sub1, sub2);

        System.out.println("Substring using charAt(): " + sub1);
        System.out.println("Substring using substring(): " + sub2);
        System.out.println("Both substrings are equal: " + same);

        sc.close();
    }
}