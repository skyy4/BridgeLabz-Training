import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String txt = sc.nextLine();
        String rev = "";

        // Reverse the string using charAt()
        for (int i = txt.length() - 1; i >= 0; i--) {
            rev = rev + txt.charAt(i);
        }

        System.out.println("Reversed string: " + rev);

        sc.close();
    }
}