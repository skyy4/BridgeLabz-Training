import java.util.function.*;

class TempAlert {
    public static void main(String[] a) {
        Predicate<Double> p = t -> t > 38;
        System.out.println(p.test(40.5));
    }
}
