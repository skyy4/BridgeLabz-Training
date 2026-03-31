import java.util.Scanner;

public class ShortLongWord {

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

        String[][] arr = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            arr[i][0] = words[i];
            arr[i][1] = String.valueOf(findLen(words[i]));
        }

        return arr;
    }

    // Find shortest and longest word indexes
    public static int[] findShortLong(String[][] arr) {

        int sIdx = 0;
        int lIdx = 0;

        for (int i = 1; i < arr.length; i++) {

            int cur = Integer.parseInt(arr[i][1]);
            int min = Integer.parseInt(arr[sIdx][1]);
            int max = Integer.parseInt(arr[lIdx][1]);

            if (cur < min) {
                sIdx = i;
            }

            if (cur > max) {
                lIdx = i;
            }
        }

        return new int[]{sIdx, lIdx};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String txt = sc.nextLine();

        String[] words = splitManual(txt);
        String[][] data = make2D(words);
        int[] res = findShortLong(data);

        System.out.println("Shortest word: " + data[res[0]][0]);
        System.out.println("Longest word: " + data[res[1]][0]);

        sc.close();
    }
}