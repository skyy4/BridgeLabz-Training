import java.util.Scanner;

public class AnagramCheck {

    // Check whether two texts are anagrams
    public static boolean isAnagram(String t1, String t2) {

        // Check length of both texts
        if (t1.length() != t2.length()) {
            return false;
        }

        int[] f1 = new int[256];
        int[] f2 = new int[256];

        // Count frequency of characters in first text
        for (int i = 0; i < t1.length(); i++) {
            f1[t1.charAt(i)]++;
        }

        // Count frequency of characters in second text
        for (int i = 0; i < t2.length(); i++) {
            f2[t2.charAt(i)]++;
        }

        // Compare character frequencies
        for (int i = 0; i < 256; i++) {
            if (f1[i] != f2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        boolean res = isAnagram(s1, s2);

        if (res) {
            System.out.println("The given texts are anagrams");
        } else {
            System.out.println("The given texts are not anagrams");
        }

        sc.close();
    }
}