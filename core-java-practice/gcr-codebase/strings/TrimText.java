import java.util.Scanner;

public class TrimText {

    // Find start and end index without leading and trailing spaces
    public static int[] trimIdx(String txt) {

        int st = 0;
        int ed = 0;

        // Find starting index without space
        while (st < txt.length() && txt.charAt(st) == ' ') {
            st++;
        }

        ed = txt.length() - 1;

        // Find ending index without space
        while (ed >= st && txt.charAt(ed) == ' ') {
            ed--;
        }

        return new int[]{st, ed};
    }

    // Create substring using charAt()
    public static String makeSub(String txt, int st, int ed) {

        String res = "";

        for (int i = st; i <= ed; i++) {
            res = res + txt.charAt(i);
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

        int[] idx = trimIdx(txt);
        String res1 = makeSub(txt, idx[0], idx[1]);
        String res2 = txt.trim();

        boolean same = cmpStr(res1, res2);

        System.out.println("Trimmed using charAt(): [" + res1 + "]");
        System.out.println("Trimmed using trim(): [" + res2 + "]");
        System.out.println("Both results are equal: " + same);

        sc.close();
    }
}