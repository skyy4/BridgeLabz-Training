package ExceptionHandling;

public class Propagate {

    static void m1() {
        System.out.println(10 / 0);
    }

    static void m2() {
        m1();
    }

    public static void main(String[] args) {
        try {
            m2();
        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }
    }
}
