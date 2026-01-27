public class NestedTry {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30 };
        int i = 1, d = 0;

        try {
            try {
                System.out.println(a[i] / d);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        }
    }
}
