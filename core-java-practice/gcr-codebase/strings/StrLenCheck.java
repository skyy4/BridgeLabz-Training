import java.util.Scanner;

public class StrLenCheck {

    // Find length of string without using length()
    public static int findLen(String txt) {

        int cnt = 0;

        try {
            while (true) {
                txt.charAt(cnt);
                cnt++;
            }
        }
        // charAt() throws exception when index goes out of bounds
        catch (RuntimeException e) {
            return cnt;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String txt = sc.next();

        int len1 = findLen(txt);
        int len2 = txt.length();

        System.out.println("Length without length(): " + len1);
        System.out.println("Length using length(): " + len2);

        sc.close();
    }
}