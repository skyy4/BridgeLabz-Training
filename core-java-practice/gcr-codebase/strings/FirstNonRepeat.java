import java.util.Scanner;

public class FirstNonRepeat {

    // Find the first non-repeating character using charAt()
    public static char findFirstNonRepeat(String txt) {

        int[] freq = new int[256]; // ASCII character frequency

        // Count frequency of each character
        for (int i = 0; i < txt.length(); i++) {
            char ch = txt.charAt(i);
            freq[ch]++;
        }

        // Find first character with frequency 1
        for (int i = 0; i < txt.length(); i++) {
            char ch = txt.charAt(i);
            if (freq[ch] == 1) {
                return ch;
            }
        }

        return '\0'; // indicates no non-repeating character
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String txt = sc.nextLine();

        char res = findFirstNonRepeat(txt);

        if (res != '\0') {
            System.out.println("First non-repeating character: " + res);
        } else {
            System.out.println("No non-repeating character found");
        }

        sc.close();
    }
}