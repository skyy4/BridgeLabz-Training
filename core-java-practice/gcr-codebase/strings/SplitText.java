import java.util.Scanner;

public class SplitText {

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

        // Count number of words
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

        // Extract words using indexes
        for (int i = 0; i < wc; i++) {
            String w = "";
            for (int j = sp[i] + 1; j < sp[i + 1]; j++) {
                w = w + txt.charAt(j);
            }
            words[i] = w;
        }

        return words;
    }

    // Compare two String arrays
    public static boolean cmpArr(String[] a, String[] b) {

        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String txt = sc.nextLine();

        String[] arr1 = splitManual(txt);
        String[] arr2 = txt.split(" ");

        boolean same = cmpArr(arr1, arr2);

        System.out.println("Result using manual split:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        System.out.println("Result using split():");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        System.out.println("Both results are equal: " + same);

        sc.close();
    }
}