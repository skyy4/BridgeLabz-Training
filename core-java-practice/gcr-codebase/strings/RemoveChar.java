import java.util.Scanner;

public class RemoveChar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String txt = sc.nextLine();   // input string
        char rem = sc.next().charAt(0); // character to remove

        String res = "";

        // Remove all occurrences of the character
        for (int i = 0; i < txt.length(); i++) {

            char ch = txt.charAt(i);

            if (ch != rem) {
                res = res + ch;
            }
        }

        System.out.println("String after removal: " + res);

        sc.close();
    }
}