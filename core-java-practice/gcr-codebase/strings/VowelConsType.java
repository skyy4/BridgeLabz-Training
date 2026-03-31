import java.util.Scanner;

public class VowelConsType {

    // Check character type: Vowel, Consonant, or Not a Letter
    public static String chkChar(char ch) {

        // Convert uppercase to lowercase using ASCII
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        } else if (ch >= 'a' && ch <= 'z') {
            return "Consonant";
        }

        return "Not a Letter";
    }

    // Create 2D array of character and its type
    public static String[][] findTypes(String txt) {

        String[][] res = new String[txt.length()][2];

        for (int i = 0; i < txt.length(); i++) {
            res[i][0] = String.valueOf(txt.charAt(i));
            res[i][1] = chkChar(txt.charAt(i));
        }

        return res;
    }

    // Display 2D array in tabular format
    public static void show(String[][] arr) {

        System.out.println("Character\tType");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + "\t\t" + arr[i][1]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String txt = sc.nextLine();

        String[][] res = findTypes(txt);

        show(res);

        sc.close();
    }
}