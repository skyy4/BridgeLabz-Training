import java.util.Scanner;

public class ReplaceWord {

    // Replace a word in a sentence without using built-in replace()
    public static String replaceWord(String txt, String oldW, String newW) {

        String res = "";
        int i = 0;

        while (i < txt.length()) {

            boolean match = true;

            // Check if old word matches at current index
            if (i + oldW.length() <= txt.length()) {

                for (int j = 0; j < oldW.length(); j++) {
                    if (txt.charAt(i + j) != oldW.charAt(j)) {
                        match = false;
                        break;
                    }
                }
            } else {
                match = false;
            }

            // If word matches, replace it
            if (match) {
                res = res + newW;
                i = i + oldW.length();
            } else {
                res = res + txt.charAt(i);
                i++;
            }
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine(); // input sentence
        String oldWord = sc.next();      // word to replace
        String newWord = sc.next();      // replacement word

        String result = replaceWord(sentence, oldWord, newWord);

        System.out.println("Updated sentence:");
        System.out.println(result);

        sc.close();
    }
}