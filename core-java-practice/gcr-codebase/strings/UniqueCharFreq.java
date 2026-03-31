import java.util.Scanner;

public class UniqueCharFreq {

    // Find unique characters using charAt() and nested loops
    public static char[] uniqueChars(String txt) {

        int len = txt.length();
        char[] temp = new char[len];
        int idx = 0;

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

    // Find frequency of characters using unique characters
    public static String[][] findFreq(String txt) {

        int[] freq = new int[256];

        // Count frequency of each character
        for (int i = 0; i < txt.length(); i++) {
            freq[txt.charAt(i)]++;
        }

        char[] uniq = uniqueChars(txt);
        String[][] res = new String[uniq.length][2];

        // Store unique character and its frequency
        for (int i = 0; i < uniq.length; i++) {
            res[i][0] = String.valueOf(uniq[i]);
            res[i][1] = String.valueOf(freq[uniq[i]]);
        }

        return res;
    }

    // Display result in tabular format
    public static void show(String[][] arr) {

        System.out.println("Character\tFrequency");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + "\t\t" + arr[i][1]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String txt = sc.nextLine();

        String[][] res = findFreq(txt);

        show(res);

        sc.close();
    }
}