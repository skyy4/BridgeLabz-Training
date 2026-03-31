import java.util.Scanner;

public class StrIndexEx {

    // Generate StringIndexOutOfBoundsException
    public static void genEx(String txt) {

        // Access index beyond string length
        System.out.println(txt.charAt(txt.length()));
    }

    // Handle StringIndexOutOfBoundsException using try-catch
    public static void handleEx(String txt) {

        try {
            System.out.println(txt.charAt(txt.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException handled");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String txt = sc.next();

        // Call method that generates exception
        try {
            genEx(txt);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception generated");
        }

        // Call method that handles exception
        handleEx(txt);

        sc.close();
    }
}