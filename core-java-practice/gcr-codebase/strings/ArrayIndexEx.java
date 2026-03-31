import java.util.Scanner;

public class ArrayIndexEx {

    // Generate ArrayIndexOutOfBoundsException
    public static void genEx(String[] arr) {

        // Access index beyond array length
        System.out.println(arr[arr.length]);
    }

    // Handle ArrayIndexOutOfBoundsException using try-catch
    public static void handleEx(String[] arr) {

        try {
            System.out.println(arr[arr.length]);
        }
        // Handle specific ArrayIndexOutOfBoundsException
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled");
        }
        // Handle any other runtime exception
        catch (RuntimeException e) {
            System.out.println("RuntimeException handled");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
        }

        // Call method that generates exception
        try {
            genEx(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception generated");
        }

        // Call method that handles exception
        handleEx(names);

        sc.close();
    }
}