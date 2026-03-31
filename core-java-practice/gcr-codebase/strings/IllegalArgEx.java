import java.util.Scanner;

public class IllegalArgEx {

    // Generate IllegalArgumentException
    public static void genEx(String txt) {

        // Start index greater than end index
        System.out.println(txt.substring(5, 2));
    }

    // Handle IllegalArgumentException using try-catch
    public static void handleEx(String txt) {

        try {
            System.out.println(txt.substring(5, 2));
        }
        // Handle specific IllegalArgumentException
        catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled");
        }
        // Handle any other runtime exception
        catch (RuntimeException e) {
            System.out.println("RuntimeException handled");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String txt = sc.next();

        // Call method that generates exception
        try {
            genEx(txt);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception generated");
        }

        // Call method that handles exception
        handleEx(txt);

        sc.close();
    }
}