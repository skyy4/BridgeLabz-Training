import java.util.*;

public class LexicalTwist {

    static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }

    static boolean invalid(String s) {
        return s.trim().contains(" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first word");
        String a = sc.nextLine();

        if (invalid(a)) {
            System.out.println(a + " is an invalid word");
            return;
        }

        System.out.println("Enter the second word");
        String b = sc.nextLine();

        if (invalid(b)) {
            System.out.println(b + " is an invalid word");
            return;
        }

        String rev = new StringBuilder(a).reverse().toString();

        if (rev.equalsIgnoreCase(b)) {
            String s = rev.toLowerCase();
            StringBuilder out = new StringBuilder();

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (isVowel(c))
                    out.append('@');
                else
                    out.append(c);
            }

            System.out.println(out);
        } else {
            String c = (a + b).toUpperCase();
            int v = 0, con = 0;

            for (int i = 0; i < c.length(); i++) {
                char ch = c.charAt(i);
                if (ch >= 'A' && ch <= 'Z') {
                    if (isVowel(ch))
                        v++;
                    else
                        con++;
                }
            }

            if (v == con) {
                System.out.println("Vowels and consonants are equal");
                return;
            }

            StringBuilder res = new StringBuilder();

            for (int i = 0; i < c.length() && res.length() < 2; i++) {
                char ch = c.charAt(i);
                if (v > con && isVowel(ch) && res.indexOf("" + ch) == -1)
                    res.append(ch);
                else if (con > v && !isVowel(ch) && ch >= 'A' && ch <= 'Z' && res.indexOf("" + ch) == -1)
                    res.append(ch);
            }

            System.out.println(res);
        }
    }
}
