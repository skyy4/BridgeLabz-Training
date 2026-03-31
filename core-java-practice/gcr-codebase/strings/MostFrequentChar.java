import java.util.Scanner;

public class MostFrequentChar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String txt = sc.nextLine();

        int[] freq = new int[256]; // ASCII frequency array

        // Count frequency of each character
        for (int i = 0; i < txt.length(); i++) {
            freq[txt.charAt(i)]++;
        }

        char maxChar = txt.charAt(0);
        int maxFreq = freq[maxChar];

        // Find the character with maximum frequency
        for (int i = 1; i < txt.length(); i++) {
            char ch = txt.charAt(i);

            if (freq[ch] > maxFreq) {
                maxFreq = freq[ch];
                maxChar = ch;
            }
        }

        System.out.println(
            "Most frequent character: " + maxChar +
            " (occurs " + maxFreq + " times)"
        );

        sc.close();
    }
}