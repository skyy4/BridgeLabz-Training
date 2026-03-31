import java.util.*;

public class Program {

    public static String CleanseAndInvert(String input) {

        if (input == null || input.length() < 6)
            return "";

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == ' ' || !Character.isLetter(c))
                return "";
        }

        String s = input.toLowerCase();
        StringBuilder t = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c % 2 != 0) // keep odd ASCII
                t.append(c);
        }

        t.reverse();

        for (int i = 0; i < t.length(); i++) {
            if (i % 2 == 0)
                t.setCharAt(i, Character.toUpperCase(t.charAt(i)));
        }

        return t.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the word");
        String in = sc.nextLine();

        String res = CleanseAndInvert(in);

        if (res.equals(""))
            System.out.println("Invalid Input");
        else
            System.out.println("The generated key is - " + res);
    }
}
