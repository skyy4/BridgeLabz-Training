public class ArrayTest {
    public static void main(String[] args) {
        try {
            int[] a = { 10, 20, 30 };
            int i = 5;
            System.out.println(a[i]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
    }
}
