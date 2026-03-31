import java.util.Scanner;

public class WordLen2D {

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

    // Split text into words using charAt()
    public static String[] splitManual(String txt) {

        int len = findLen(txt);
        int wc = 1;

        // Count words
        for (int i = 0; i < len; i++) {
            if (txt.charAt(i) == ' ') {
                wc++;
            }
        }

        int[] sp = new int[wc + 1];
        int si = 0;
        sp[si++] = -1;

        // Store space indexes
        for (int i = 0; i < len; i++) {
            if (txt.charAt(i) == ' ') {
                sp[si++] = i;
            }
        }
        sp[si] = len;

        String[] words = new String[wc];

        // Extract words
        for (int i = 0; i < wc; i++) {
            String w = "";
            for (int j = sp[i] + 1; j < sp[i + 1]; j++) {
                w = w + txt.charAt(j);
            }
            words[i] = w;
        }

        return words;
    }

    // Create 2D array of word and its length
    public static String[][] make2D(String[] words) {

        String[][] res = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            res[i][0] = words[i];
            res[i][1] = String.valueOf(findLen(words[i]));
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String txt = sc.nextLine();

        String[] words = splitManual(txt);
        String[][] out = make2D(words);

        System.out.println("Word\tLength");
        for (int i = 0; i < out.length; i++) {
            int l = Integer.parseInt(out[i][1]);
            System.out.println(out[i][0] + "\t" + l);
        }

        sc.close();
    }
}