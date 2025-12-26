import java.util.Scanner;

public class VowelConsonantCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String txt = sc.nextLine();

        int v = 0;
        int c = 0;

        for (int i = 0; i < txt.length(); i++) {

            char ch = txt.charAt(i);

            // Convert uppercase to lowercase
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }

            // Check for vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                v++;
            }
            // Check for consonant
            else if (ch >= 'a' && ch <= 'z') {
                c++;
            }
        }

        System.out.println("Vowels count = " + v);
        System.out.println("Consonants count = " + c);

        sc.close();
    }
}