public class Interest {

    static double calc(double amt, double rate, int y)
            throws IllegalArgumentException {

        if (amt < 0 || rate < 0)
            throw new IllegalArgumentException();
        return amt * rate * y / 100;
    }

    public static void main(String[] args) {
        try {
            System.out.println(calc(1000, 5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: Amount and rate must be positive");
        }
    }
}
