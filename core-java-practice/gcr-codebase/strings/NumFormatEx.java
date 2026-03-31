import java.util.Scanner;

public class NumFormatEx {

    // Generate NumberFormatException
    public static void genEx(String txt) {

        // Parsing non-numeric text to integer
        int n = Integer.parseInt(txt);
        System.out.println(n);
    }

    // Handle NumberFormatException using try-catch
    public static void handleEx(String txt) {

        try {
            int n = Integer.parseInt(txt);
            System.out.println(n);
        }
        // Handle specific NumberFormatException
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled");
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
        } catch (NumberFormatException e) {
            System.out.println("Exception generated");
        }

        // Call method that handles exception
        handleEx(txt);

        sc.close();
    }
}