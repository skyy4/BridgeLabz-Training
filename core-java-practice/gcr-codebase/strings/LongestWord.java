import java.util.Scanner;

public class LongestWord {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String txt = sc.nextLine();

        String word = "";
        String longest = "";

        // Traverse the sentence character by character
        for (int i = 0; i < txt.length(); i++) {

            char ch = txt.charAt(i);

            // Build the current word
            if (ch != ' ') {
                word = word + ch;
            } 
            // Space found → check word length
            else {
                if (word.length() > longest.length()) {
                    longest = word;
                }
                word = "";
            }
        }

        // Check the last word (important)
        if (word.length() > longest.length()) {
            longest = word;
        }

        System.out.println("Longest word: " + longest);

        sc.close();
    }
}