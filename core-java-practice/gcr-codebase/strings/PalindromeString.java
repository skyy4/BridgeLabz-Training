import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String txt = sc.nextLine();

        int st = 0;
        int ed = txt.length() - 1;

        boolean isPal = true;

        // Compare characters from start and end
        while (st < ed) {
            if (txt.charAt(st) != txt.charAt(ed)) {
                isPal = false;
                break;
            }
            st++;
            ed--;
        }

        if (isPal) {
            System.out.println("The given string is a palindrome");
        } else {
            System.out.println("The given string is not a palindrome");
        }

        sc.close();
    }
}