import java.util.Scanner;

public class UniqueChars {

    // Find length of string without using length()
    public static int findLen(String txt) {

        int cnt = 0;

        try {
            while (true) {
                txt.charAt(cnt);
                cnt++;
            }
        } catch (RuntimeException e) {
            return cnt;
        }
    }

    // Find unique characters using charAt()
    public static char[] findUnique(String txt) {

        int len = findLen(txt);
        char[] temp = new char[len];
        int idx = 0;

        // Find unique characters using nested loops
        for (int i = 0; i < len; i++) {

            char ch = txt.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (txt.charAt(j) == ch) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[idx] = ch;
                idx++;
            }
        }

        char[] res = new char[idx];
        for (int i = 0; i < idx; i++) {
            res[i] = temp[i];
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String txt = sc.nextLine();

        char[] uniq = findUnique(txt);

        System.out.println("Unique characters:");

        for (int i = 0; i < uniq.length; i++) {
            System.out.println(uniq[i]);
        }

        sc.close();
    }
}