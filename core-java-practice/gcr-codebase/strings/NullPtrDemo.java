public class NullPtrDemo {

    // Generate NullPointerException
    public static void genEx() {

        String txt = null;

        // Accessing String method on null reference
        System.out.println(txt.length());
    }

    // Handle NullPointerException using try-catch
    public static void handleEx() {

        String txt = null;

        try {
            System.out.println(txt.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled");
        }
    }

    public static void main(String[] args) {

        // Call method that generates exception
        try {
            genEx();
        } catch (NullPointerException e) {
            System.out.println("Exception generated");
        }

        // Call method that handles exception
        handleEx();
    }
}