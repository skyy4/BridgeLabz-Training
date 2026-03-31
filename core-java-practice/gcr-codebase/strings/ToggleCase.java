import java.util.Scanner;

public class ToggleCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String txt = sc.nextLine();
        String res = "";

        // Toggle case using charAt()
        for (int i = 0; i < txt.length(); i++) {

            char ch = txt.charAt(i);

            // Uppercase to lowercase
            if (ch >= 'A' && ch <= 'Z') {
                res = res + (char) (ch + 32);
            }
            // Lowercase to uppercase
            else if (ch >= 'a' && ch <= 'z') {
                res = res + (char) (ch - 32);
            }
            // Non-alphabet characters remain unchanged
            else {
                res = res + ch;
            }
        }

        System.out.println("Toggled string: " + res);

        sc.close();
    }
}