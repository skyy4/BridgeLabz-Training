import java.util.Scanner;

public class CharArrayCheck {

    // Return characters of a string without using toCharArray()
    public static char[] getChars(String s) {

        char[] arr = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }

        return arr;
    }

    // Compare two character arrays
    public static boolean cmpArr(char[] a, char[] b) {

        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String txt = sc.next();

        char[] arr1 = getChars(txt);
        char[] arr2 = txt.toCharArray();

        boolean same = cmpArr(arr1, arr2);

        System.out.println("Arrays are equal: " + same);

        sc.close();
    }
}