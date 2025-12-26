import java.util.Scanner;

public class LexicoCompare {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        int i = 0;
        int res = 0;

        // Compare characters one by one
        while (i < s1.length() && i < s2.length()) {

            if (s1.charAt(i) != s2.charAt(i)) {
                res = s1.charAt(i) - s2.charAt(i);
                break;
            }
            i++;
        }

        // If all compared characters are same
        if (res == 0) {
            res = s1.length() - s2.length();
        }

        if (res == 0) {
            System.out.println("Both strings are equal");
        } else if (res < 0) {
            System.out.println("First string comes before second string");
        } else {
            System.out.println("First string comes after second string");
        }

        sc.close();
    }
}