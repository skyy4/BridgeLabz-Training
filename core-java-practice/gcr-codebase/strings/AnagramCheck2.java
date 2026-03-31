import java.util.*;

public class AnagramCheck2 {

    // Check if two strings are anagrams
    public static boolean isAnagram(String s1, String s2) {

        // If lengths are not equal, cannot be anagrams
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] freq = new int[256]; // ASCII frequency array

        // Increase frequency for first string
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i)]++;
        }

        // Decrease frequency for second string
        for (int i = 0; i < s2.length(); i++) {
            freq[s2.charAt(i)]--;
        }

        // Check if all frequencies are zero
        for (int i = 0; i < 256; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        if (isAnagram(str1, str2)) {
            System.out.println("The given strings are anagrams");
        } else {
            System.out.println("The given strings are not anagrams");
        }

        sc.close();
    }
}