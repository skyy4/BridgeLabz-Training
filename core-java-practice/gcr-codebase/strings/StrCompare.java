import java.util.Scanner;

public class StrCompare {

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

        String a = sc.next();
        String b = sc.next();

        boolean res1 = cmpStr(a, b);
        boolean res2 = a.equals(b);

        System.out.println("Result using charAt(): " + res1);
        System.out.println("Result using equals(): " + res2);

        sc.close();
    }
}