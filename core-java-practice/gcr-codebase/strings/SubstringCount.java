import java.util.Scanner;

public class SubstringCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String txt = sc.nextLine();   // main string
        String sub = sc.nextLine();   // substring to search

        int count = 0;

        // Count occurrences of substring
        for (int i = 0; i <= txt.length() - sub.length(); i++) {

            boolean match = true;

            for (int j = 0; j < sub.length(); j++) {
                if (txt.charAt(i + j) != sub.charAt(j)) {
                    match = false;
                    break;
                }
            }

            if (match) {
                count++;
            }
        }

        System.out.println("Substring occurs " + count + " times");

        sc.close();
    }
}