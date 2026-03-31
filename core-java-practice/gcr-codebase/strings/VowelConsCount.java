import java.util.Scanner;

public class VowelConsCount {

    // Check whether a character is vowel, consonant, or not a letter
    public static int chkChar(char ch) {

        // Convert uppercase to lowercase using ASCII
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        // Check for vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return 1;   // vowel
        }
        // Check for consonant
        else if (ch >= 'a' && ch <= 'z') {
            return 2;   // consonant
        }

        return 0;       // not a letter
    }

    // Count vowels and consonants in a string
    public static int[] cntVC(String txt) {

        int v = 0;
        int c = 0;

        for (int i = 0; i < txt.length(); i++) {

            int res = chkChar(txt.charAt(i));

            if (res == 1) {
                v++;
            } else if (res == 2) {
                c++;
            }
        }

        return new int[]{v, c};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String txt = sc.nextLine();

        int[] res = cntVC(txt);

        System.out.println("Vowels count = " + res[0]);
        System.out.println("Consonants count = " + res[1]);

        sc.close();
    }
}